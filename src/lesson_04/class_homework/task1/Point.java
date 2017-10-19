package lesson_04.class_homework.task1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Функция-геттер для поля x (getНазваниеПоляСБольшойБуквы)
    public double getX() {
        return x;
    }

    //Функция-cеттер для поля x (setНазваниеПоляСБольшойБуквы)
    public void setX(double x) {
        this.x = x;
    }

    //Функция-геттер для поля x (getНазваниеПоляСБольшойБуквы)
    public double getY() {
        return y;
    }

    //Функция-cеттер для поля x (setНазваниеПоляСБольшойБуквы)
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }

        if (object == this) {
            return true;
        }

        if (object.getClass() != this.getClass()) {
            return false;
        }

        Point other = (Point)object;

        if (this.x == other.x && this.y == other.y) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    public double distanceTo(Point other) {
        if (other == null) {
            System.err.println("Передана ошибочная точка");
            return 0.0;
        } else {
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    public static double distanceBetween(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            System.err.println("Передана ошибочная точка");
            return 0.0;
        } else {
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }
}

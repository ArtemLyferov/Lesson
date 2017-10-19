package lesson_04.class_homework.task1;

public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        if (p1 == null || p2 == null || p3 == null) {
            System.err.println("Одна или несколько точек отсутствуют");
        } else if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            System.err.println("Одна или несколько точек равны");
        } else {
            double l12 = Point.distanceBetween(p1, p2);
            double l23 = Point.distanceBetween(p2, p3);
            double l13 = Point.distanceBetween(p1, p3);
            if (l12 + l23 <= l13 || l23 + l13 <= l12 || l12 + l13 <= l23) {
                System.err.println("Точки лежат на одной линии");
            } else {
                this.p1 = p1;
                this.p2 = p2;
                this.p3 = p3;
            }
        }
    }

}

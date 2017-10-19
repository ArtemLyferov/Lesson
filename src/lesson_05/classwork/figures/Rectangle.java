package lesson_05.classwork.figures;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */
public class Rectangle extends Figure {
    //Ширина
    private final double width;
    //Высота
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //метод с модификатором final
    //нельзя переопределить в классах-наследниках
    @Override
    public final double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник с высотой %.2f, шириной - %.2f", height, width);
    }

}

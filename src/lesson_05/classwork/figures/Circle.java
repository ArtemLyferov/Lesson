package lesson_05.classwork.figures;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */
public class Circle extends Figure{
    private final double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public  double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return String.format("Окружность с радиусом %.2f", radius);
    }
}

package lesson_05.classwork.figures;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */
public class App {
    public static void main(String[] args) {
        Figure f1=new Triangle(3,4,5);
        System.out.println(f1);
        System.out.println(f1.getArea());
        System.out.println(f1.getPerimeter());

        Figure f2=new Rectangle(10,5);
        System.out.println(f2);
        System.out.println(f2.getArea());
        System.out.println(f2.getPerimeter());

        Figure f3=new Circle(10);
        System.out.println(f3);
        System.out.println(f3.getArea());
        System.out.println(f3.getPerimeter());

        //Нельзя создавать объект
        //Figure f4=new Figure();
        //System.out.println(f4);
        //System.out.println(f4.getArea());
        //System.out.println(f4.getPerimeter());


    }
}

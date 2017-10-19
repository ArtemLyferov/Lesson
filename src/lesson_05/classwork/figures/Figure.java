package lesson_05.classwork.figures;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */

// Класс фигура
    //Абстрактный класс может содержать абстрактные методы и объекты данного класса нельзя создавать
public abstract class Figure {

    //Абстрактный метод не имеет никакого тела
    //Метод нужно обязательно переопределить в классе-наследнике

    //Площадь фигуры
    public abstract double getArea();

    //Периметр фигуры
    public abstract double getPerimeter();

    /*
    @Override
    public String toString(){
        return "Геометрическая фигура";
    }*/
}

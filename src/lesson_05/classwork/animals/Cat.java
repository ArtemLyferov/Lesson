package lesson_05.classwork.animals;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */
public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    public String toString(){
        return "Кошка по имени"+getName();
    }
}

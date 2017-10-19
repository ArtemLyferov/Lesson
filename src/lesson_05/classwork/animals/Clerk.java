package lesson_05.classwork.animals;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */

// Класс Чиновник
public class Clerk extends Human {
    public Clerk(String name,int salary){
        super(name,salary);
    }

    @Override
    public String toString(){
        return "Чиновник "+getName()+" с зарплатой, которую нам не нужно знать";
    }
}

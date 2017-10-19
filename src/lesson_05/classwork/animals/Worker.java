package lesson_05.classwork.animals;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */

// Класс рабочий
public class Worker extends Human {
    public Worker(String name,int salary){
        super(name, salary);
    }

    //Публичный метод, возвращающий protected-поле
    //Такие методы, по возможности, не должны создаваться "Семейные секреты не д. раскрываться"
    //(см. антипатерный "Pyblic морозов")
    public int getSalary(){
        return this.salary;
    }
}


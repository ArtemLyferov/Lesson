package lesson_05.classwork.animals;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */
//Класс человека, расширенный от класса животное
public class Human extends Animal{

    protected int salary;

    ///Если в конструкторе нет вызова родительского конструктора
    //через вызов super(...), то компилятор автоматически
    //подставит вызов родительского конструктора без параметров
    //(super()). При отсутствии конструктора без параметров
    //у родителя, необходимо через super(...) обязательно
    //вызвать существующий род. конструктор

    //Конструктор с параметром, вызывающий такой же конструктор родительского класса
    public Human(String name,int salary){
        super(name);
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Человек по имени"+getName()+" с зарплатой "+salary+" рублей";
    }
}

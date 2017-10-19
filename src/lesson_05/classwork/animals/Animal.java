package lesson_05.classwork.animals;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */
// Класс, представляющий собой некоторое животное
public class Animal {
    //Поле "имя" - у каждого животного есть имя
    //Если поставить лмодификатор final пред полем, то оно становиться полем только для чтения, при
    //этом его можно поменять только в конструкторе
    private final String name;

    //При создании объекта ЖИВОТНОЕ имя выдается "на всю жизнь"
    public Animal(String name){
        this.name=name;
    }
    //Метод, возвращающий имя животного
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Животное по имени"+name;
    }
}

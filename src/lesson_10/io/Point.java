package lesson_10.io;

import java.io.Serializable;

//Если класс реализует этот интерфейс, то Java создает автоматически внутри себя
//методы, которые могут превратить объект этого класса в набор байтов
public class Point implements Serializable {

    public int x;
    public int y;

    //Чтобы поле класса не сохранялось при сериализации,
    //необходимо его пометить ключевым словом transient
    public transient int id;

}

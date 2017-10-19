package lesson_04.class_homework;

// Эта конструкция говорит о том, что класс Bird можно использовать
// по имени (неполному)
import lesson_03.classwork.Bird;

import lesson_02.classwork.App;

//import app03_2009.App;

public class PackageTest {

    public static void main(String[] args) {
        Bird bird = new Bird();

        lesson_02.classwork.App app = new lesson_02.classwork.App();
        App app1 = new App();

        int a = 1 / 0;

    }

}

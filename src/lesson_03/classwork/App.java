package lesson_03.classwork;

public class App {
    public static void main(String[] args) {
        // Объявление ссылки на объект класса Bird (ссылка не инициализирована и
        // ее использовать нельзя)
        Bird bird;

        //Установка ссылки на null (отсутствие объекта по ссылке)
        bird=null;

        //Создание объекта класса Bird
        new Bird();

        // Создание объекта класса Bird и получение ссылки на него
        bird=new Bird();

        //Объявляем новую ссылку и устанавливаем её на тот же объект, на который указывает
        //ссылка bird
        Bird bird1=bird;

        // Ссылки указывают на один объект при присвоении, а переменные типа byte,int,shot,long,
        //float,double,char,boolean копируются при присвоении
        int x=4;
        int y=x;

        //Получение поля name объекта bird и вывод его на экран
        System.out.println(bird.name);

        //Присвоение полю обекта нового значения
        bird.name="Кеша";
        System.out.println(bird.name);

        //Вызов метода объекта
        bird1.sayHello();

        //Вызов метода объекта с параметами
        bird1.rename("Арирстарх");
        System.out.println(bird.name);

        //Вызов перегруженного метода
        bird1.sayHello("Михаил");

        //Создание птицы через наш собственный конструктор
        Bird bird2=new Bird("Синица");
        System.out.println(bird2.name);
        bird2.sayHello();

        //Вызов публичного метода класса и вывод его результата на экран
        System.out.println(bird2.getYear());

        //Оьращение к приватное перемнной объекта не разрешено
        //System.out.println(bird2.year);

        // Два способа обращения к статическиой переменнной
        // 1. Через название
        System.out.println(Bird.birdKind);
        // 2. Через объект этого класса
        System.out.println(bird2.birdKind);

        Bird.birdKind="Орлы";

        //Вызов статического метода
        System.out.println(Bird.getBirdCount());

        //Вызов метода с переменными количеством параметров
        System.out.println(Bird.sum());
        System.out.println(Bird.sum(1));
        System.out.println(Bird.sum(1,2));
        System.out.println(Bird.sum(3,4,5,6,7));

        //Вызов метода с массивом
        System.out.println(Bird.sum2(new int[0]));
        System.out.println(Bird.sum2(new int[]{1}));
        System.out.println(Bird.sum2(new int[]{1,2}));
        System.out.println(Bird.sum2(new int[]{3,4,5,6,7}));

        // Класс Object - предок всех классов в java
        Object object = new Object();
        object.toString(); //метод перевода объекта в строку

        System.out.println(bird);

        //Проверка сравнений
        System.out.println(bird.equals(null));
        System.out.println(bird.equals("Строка"));
        System.out.println(bird.equals(bird));
        System.out.println(bird.equals(bird1));
        System.out.println(bird.equals(bird2));



    }
}

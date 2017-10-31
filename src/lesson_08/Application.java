package lesson_08;

import lesson_05.classwork.figures.Circle;
import lesson_05.classwork.figures.Figure;
import lesson_05.classwork.figures.Rectangle;
import lesson_05.classwork.figures.Triangle;

import java.security.SecureRandom;
import java.security.Security;
import java.util.*;

public class Application {

    public static void main(String[] args) {

        //Collection - интерфейс, который реализуют все коллекции
        //Set - коллекции, в которых все элементы уникальны

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }

        //Цикл foreach
        //До двоеточия пишется тип и название объекта,
        //который будет извлекаться из коллекции на каждом шаге цикла
        //а после двоеточия пишется та коллекция, которую нужно обойти
        //(Объект после двоеточия обязан реализовывать интерфейс Iterable)
        for (Integer i : list) {
            System.out.println(i);
        }


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        System.out.println("Элементы HashSet");
        for (Integer i : hashSet) {
            System.out.println(i);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            treeSet.add(i % 10);
        }
        System.out.println("Содержимое TreeSet");
        for (Integer i : treeSet.headSet(3)) {
            System.out.println(i);
        }

        //List - это интерфейс коллекции, в которой все элементы
        //распологаются друг за другом и точно знают расположение следующего
        //и предыдущего элемента
        //ArrayList - список (List), построенный на массиве
        List<Integer> integers = new ArrayList<>();
        //LinkedList - список (List), построенный на массиве
        LinkedList<Integer> integers2 = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(i % 5);
        }
        System.out.println("Содержимое ArrayList");
        for (Integer i : integers) {
            System.out.println(i);
        }

        //Случайные числа в диапазоне [0;1]
        double random =  Math.random();
        //Целые случайные числа
        Random random1 = new Random();
        random1.nextInt(100); // генерация числа от 0 до 100 (не включая)
        //Целые случайные числа (защищенные)
        SecureRandom random2 = new SecureRandom();


        //Очередь с приоритетом
        //Элементы добавляются в произвольном порядке
        //А извлекаются в порядке возрастания
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 50; i++) {
            priorityQueue.add(random1.nextInt(100));
        }
        System.out.println("Содержимое PriorityQueue");
        for (Integer i : priorityQueue) {
            System.out.println(i);
        }
        System.out.println("Содержимое PriorityQueue," +
                " извлеченное с помощью стандартных операций");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        //Очередь с нашим собственным классом
        //PriorityQueue<Figure> figurePriorityQueue
        //        = new PriorityQueue<>(new FigureAreaComparator());

        //Компаратор в убывающем порядке
        PriorityQueue<Figure> figurePriorityQueue
                = new PriorityQueue<>(new FigureAreaComparator().reversed());
        for (int i = 0; i < 50; i++) {
            int figure = random1.nextInt(3);
            switch (figure) {
                case 0:
                    double radius = random1.nextInt(100) + 1;
                    figurePriorityQueue.add(new Circle(radius));
                    break;
                case 1:
                    double a = random1.nextInt(100) + 1;
                    double b = random1.nextInt(100) + 1;
                    figurePriorityQueue.add(new Rectangle(a, b));
                    break;
                case 2:
                    a = random1.nextInt(100) + 1;
                    b = random1.nextInt(100) + 1;
                    double c = random1.nextInt(100) + 1;
                    try {
                        figurePriorityQueue.add(new Triangle(a, b, c));
                    } catch (Exception e) {
                        radius = random1.nextInt(100) + 1;
                        figurePriorityQueue.add(new Circle(radius));
                    }
                    break;
            }
        }

        System.out.println("Содержимое очереди с фигурами");
        for (Figure f : figurePriorityQueue) {
            System.out.println(f + " площадь " + f.getArea());
        }
        System.out.println("Содержимое очереди с фигурами " +
                "(извлеченные в порядке возрастания площади)");
        while (!figurePriorityQueue.isEmpty()) {
            Figure f = figurePriorityQueue.poll();
            System.out.println(f + " площадь " + f.getArea());
        }

        //Класс Collections содержит в себе полезные методы для работы
        //c коллекциями
        //Collections.sort(); - сортировка списка
        //Collections.binarySearch() - бинарный поиск
        //Collections.shuffle(); - перемешать все элементы


    }

}

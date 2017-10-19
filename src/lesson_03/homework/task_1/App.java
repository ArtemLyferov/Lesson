package lesson_03.homework.task_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //task1();
        task2();
    }
    public static void task1() {
        Dot dot1 = new Dot();
        Dot dot2 = new Dot();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первой точки ");
        String s = scanner.nextLine();
        dot1.name = s;
        System.out.print("Введите координату Х для первой точки ");
        s = scanner.nextLine();
        dot1.x = Float.parseFloat(s);
        System.out.print("Введите координату Y для первой точки ");
        s = scanner.nextLine();
        dot1.y = Float.parseFloat(s);

        System.out.print("Введите имя второй точки ");
        s = scanner.nextLine();
        dot2.name = s;
        System.out.print("Введите координату Х для второй точки ");
        s = scanner.nextLine();
        dot2.x = Float.parseFloat(s);
        System.out.print("Введите координату Y для второй точки ");
        s = scanner.nextLine();
        dot2.y = Float.parseFloat(s);

        dot1.distance(dot2);
    }
    public static void task2(){
        Scanner scanner=new Scanner(System.in);
        LineSigment line1=new LineSigment();
        LineSigment line2=new LineSigment();
        System.out.print("Введите имя первого отрезка ");
        String s=scanner.nextLine();
        line1.name=s;
        System.out.print("Введите координату Х левого конца отрехка ");
        s=scanner.nextLine();
        line1.x1=Float.parseFloat(s);
        System.out.print("Введите координату Y левого конца отрехка ");
        s=scanner.nextLine();
        line1.y1=Float.parseFloat(s);
        System.out.print("Введите координату Х правого конца отрехка ");
        s=scanner.nextLine();
        line1.x2=Float.parseFloat(s);
        System.out.print("Введите координату Y правого конца отрехка ");
        s=scanner.nextLine();
        line1.y2=Float.parseFloat(s);

        System.out.print("Введите имя второго отрезка ");
        s=scanner.nextLine();
        line2.name=s;
        System.out.print("Введите координату Х левого конца отрехка ");
        s=scanner.nextLine();
        line2.x1=Float.parseFloat(s);
        System.out.print("Введите координату Y левого конца отрехка ");
        s=scanner.nextLine();
        line2.y1=Float.parseFloat(s);
        System.out.print("Введите координату Х правого конца отрехка ");
        s=scanner.nextLine();
        line2.x2=Float.parseFloat(s);
        System.out.print("Введите координату Y правого конца отрехка ");
        s=scanner.nextLine();
        line2.y2=Float.parseFloat(s);

        line1.comparisone(line2);
    }



}

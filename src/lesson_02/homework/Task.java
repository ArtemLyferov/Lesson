package lesson_02.homework;

import java.util.Scanner;
public class Task {
    public static void main(String[] args){
        //task0();
        //task1();
        //task2();
        //task3();
        task4();
    }
    public static void task0(){
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine(); //Читаем строку
        int i=Integer.parseInt(s); // извлекаем из строки число
        float f=Float.parseFloat(s);
        double d=Double.parseDouble(s);
    }
    public static void task1(){
        float A[];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размерность массива");
        String s=scanner.nextLine();
        int n=Integer.parseInt(s);
        A=new float[n];
        for(int i=0;i<A.length;i++) {
            System.out.printf("Введите элемент массива №%d ",i+1);
            s=scanner.nextLine();
            A[i]=Float.parseFloat(s);
        }
        System.out.println("Исходный массив");
        for(int i=0;i<A.length;i++){
            System.out.printf("%.1f  ",A[i]);
        }
        for(int i=0;i<A.length;i++){
            System.out.printf("\nВведите номер элемента массива (1-%d)\n",n);
            s=scanner.nextLine();
            int k=Integer.parseInt(s);
            A[k-1]=A[k-1]+A[k-1]*0.1f;
            System.out.println("Полученный массив");
            for(int j=0;j<A.length;j++){
                System.out.printf("%f  ",A[j]);
            }
        }
    }
    public static void task2(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите число ");
        String s=scanner.nextLine();
        int c=Integer.parseInt(s);
        int n=0;
        int k=c;
        while (k!=0) {
            k=k/10;
            n++;
        }
        int[]A=new int[n];
        for(int i=0;i<A.length;i++){
            A[A.length-i-1]=c%10;
            c=c/10;
        }
        System.out.println("Полученный массив:");
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    public static void task3(){
        System.out.print("Введите расстояние до места назначения в км ");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        float N=Float.parseFloat(s);
        System.out.print("Введите время, за которое нужно доехать в ч ");
        s=scanner.nextLine();
        float T=Float.parseFloat(s);
        float V=N/T;
        System.out.printf("Скорость, с которой нужно ехать %.2f км/ч",V);
    }
    public static void task4(){
        System.out.print("Введите размер з/п за 1 час в долларах ");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int z=Integer.parseInt(s);
        while (z<8){
            System.out.print("Работник не может получать меньше 8 долларов в час. Введите еще раз ");
            s=scanner.nextLine();
            z=Integer.parseInt(s);
        }
        System.out.print("Введите количество отработанных часов за неделю ");
        s=scanner.nextLine();
        int t=Integer.parseInt(s);
        while (t>60){
            System.out.print("Работник не может работать более 60 часов в неделю. Введите еще раз ");
            s=scanner.nextLine();
            t=Integer.parseInt(s);
        }
        float S;
        if(t>40) {
            int r=t-40;
            S=40*z+r*z*1.5f;
            System.out.printf("З/п за неделю составляет %.2f долларов",S);
        }else {
            S=z*t;
            System.out.printf("З/п за неделю составляет %.2f долларов",S);
        }
    }
}
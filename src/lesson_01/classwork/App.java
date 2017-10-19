package lesson_01.classwork;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, world");
        //Целочисленные
        byte b=10;// -128..127 (1 байт)
        short s=-1000;//-32768..32767 (2 байта)
        int i=10000000;//-2^31..2^31 -1 (4 байта)
        long l=1000000000L;//-2^63..2^63 -1 (8 байт)

        //Дробные
        float f=1.0f;// (4 байт, одинарная точность)
        double d=-7.5e-5; //(8 байт, двойная точность)

        //Символьный (2 байта)
        char c='c';

        //Логический (true и false)
        boolean bool=true;

        //Условное выражение(сокращенное)
        if(l>10000){
            System.out.println("l>10000");
        }
        //Условное выражение(полное)
        if(l>10000){
            System.out.println("l<1000");
        }else{
            System.out.println("l>=1000");
        }
        //Условное выражение с множественным выбором
        switch (b){
            case 1:
                System.out.println("b==1");
                break;
            case 2:
                System.out.println("b==2");
                break;
            case 3:
            case 4:
                System.out.println("b==3 или b==4");
                break;
            default:
                System.out.println("b неправильное");
                break;
        }
        //Условный (тернарный) оператор
        int j=s>100?200:300;
        /*
        int j=0;
        if(s>100){
        j=200;}
        else{
        j=300;}
        */

        //Циклы
        while (j<400){
            j=j+1;
            //continue;
            //break;
        }

        do{
            j=j-1;
            //continue;
            //break;
        }while (j<100);

        for(int i1=0;i1<100;i1++){
            System.out.println(i1);
            //continue;
            //break;
        }
        //Операции
        i=100+200;
        i=100-200;
        i=100*200;
        i=100/200;
        i=100%200;
        d=100.0/200;

        i=i|s;//арифметическое или
        i=i&s;//арифметическое и
        i=i^s;//арифметическое исключающие или
        i=i<<1;// *2
        i=i>>1;// /2
        i=i>>>1;

        boolean a=true&&false;// логическое и (ленивое)
        a=true||false;// логическое или (ленивое)
        a=!true;// логическое не
        a=true&false;// логическое и
        a=true|false;// логическое или
    }
}


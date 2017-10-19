package lesson_02.classwork;

public class App {
    public static void main(String[] args){
        // Способ создания массива 1
        int[]array;//оюъявление ссылки на массив чисел
        array=new int[100];// создание массива из 100 чисел и получение ссылки на него
        // Способ создания массива 2
        array=new int[]{1,20,30,-2};//массив из 4 чисел
        // Способ обращения к массиву
        array[0]=1; //запись в ячейку
        System.out.println(array[1]);//чтение и вывод на экран

        //array[-1]=1;//программа упадет здесь, т.к. произошел выход за пределы массива
        //array[4]=10;//

        System.out.println(array.length);//длина массива в элементах

        //Цикл обхода по массиву
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //Двумерный массив(ненадежный)
        int height=5;
        int weight=6;
        int[]square=new int[height*weight];
        for (int i=0;i<height;i++){
            //weight=6; ошибка
            for(int j=0;j<weight;j++){
                square[i*weight+j]=10;
            }
        }
        //Двумерный массив
        int[][]sq=new int[5][5];// явное указание размеров при создании
        for (int i=0;i<sq.length;i++){
            for(int j=0;j<sq[i].length;j++){
                System.out.println(i+","+j+"="+sq[i][j]);
            }
        }
        //Трехмерный массив
        int[][][]tr=new int[1][2][3];

        //Зубчатый массив
        int[][]jagged=new int[4][];//матриза с 4 строками
        for(int i=0;i<jagged.length;i++ ){
            jagged[i]=new int [10-i];
        }

        System.out.println("Зубчатый массив");
        for (int i=0;i<jagged.length;i++){
            for (int j=0;j<jagged[i].length;j++){
                System.out.printf("%d,%d=%d\n",i,j,jagged[i][j]);
            }
        }
        //Строка
        String s="Строка";
        int s_len = s.length(); //функция, возвращающая длину строки
        for(int i=0;i<s_len;i++){
            System.out.println(s.charAt(i));// charAt- функция получения символ
        }
        System.out.println(s+" дополнение");// строки можно складывать

        s.concat("Дополнение");// то же самое, что и дополнение
        System.out.println(s.contains("тро"));//содержится подстьрока
        System.out.println(s.contains("тор"));

        int k=s.indexOf("тро");//первое вхождение в строку(индекс)
        s.lastIndexOf("тро");//последнее вхождение в строку(индекс)

        s.indexOf("тро",k);//первое вхождение в строку начиная к-го элемента

    }
}


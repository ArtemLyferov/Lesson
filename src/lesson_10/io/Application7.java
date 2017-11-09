package lesson_10.io;

import java.io.*;

public class Application7 {

    public static void main(String[] args) {

        //Этот поток умеет писать примитивные типы Java (куда-нибудь)
        try {
            DataOutputStream dataOutputStream
                    = new DataOutputStream(new FileOutputStream("C:\\out.dat"));
            dataOutputStream.writeLong(1000);
            dataOutputStream.writeDouble(148.6);
            //dataOutputStream.flush();
            dataOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            DataInputStream dataInputStream
                    = new DataInputStream(new FileInputStream("C:\\out.dat"));

            //System.out.println(dataInputStream.readLong());
            //System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());


            int size = dataInputStream.readInt();
            if (size > 0) {
                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    array[i] = dataInputStream.readInt();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

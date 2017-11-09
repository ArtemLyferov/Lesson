package lesson_10.io;

import java.io.*;

public class Application8 {

    public static void main(String[] args) {

        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("C:\\point.dat"));
            Point p = new Point();
            p.x = -100;
            p.y = 140;
            objectOutputStream.writeObject(p);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois
                    = new ObjectInputStream(new FileInputStream("C:\\point.dat"));
            Point p = (Point)ois.readObject();
            System.out.println(p.x);
            System.out.println(p.y);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

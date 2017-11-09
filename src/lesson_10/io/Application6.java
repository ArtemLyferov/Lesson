package lesson_10.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application6 {

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\out.bin");

            fileOutputStream.write(10);
            fileOutputStream.write(20);
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

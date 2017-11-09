package lesson_10.io;

import java.io.*;

public class Application5 {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter(
                    new File("C:\\out2.properties"),
                    true
            );
            fileWriter.write("x=1\n");
            fileWriter.write("y=2\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("C:\\out2.properties");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String s = bufferedReader.readLine();
            while (s != null) {
                System.out.println(s);
                s = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

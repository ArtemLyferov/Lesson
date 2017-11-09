package lesson_10.io;

import java.io.File;
import java.util.ArrayList;

public class Application4 {

    public static void main(String[] args) {

        File root = new File("C:\\Program Files");

        ArrayList<File> found = new ArrayList<>();
        search(root, "java.exe", found);

        for (File file : found) {
            System.out.println(file.getAbsolutePath());
        }

    }

    public static void search(File root, String name, ArrayList<File> searchList) {
        System.err.println("Зашли в папку - " + root.getAbsolutePath());
        File[] files = root.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().equals(name)) {
                    searchList.add(file);
                    //file.delete();
                } else if (file.isDirectory()) {
                    search(file, name, searchList);
                }
            }
        }
    }


}

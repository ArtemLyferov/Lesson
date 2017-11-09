package lesson_10.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        File folder = new File("C:\\Program Files");

        //Метод возвращает массив строк-"названий файлов", содержащихся
        //в данной папке
        String[] filenames = folder.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }

        //Метод возвращает массив файлов, содержащихся
        //в данной папке
        File[] files = folder.listFiles();
        for (File file : files) {
            System.err.println(file.getName());
        }


        ArrayList<File> filesOnly = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                filesOnly.add(file);
            }
        }
        for (File file : filesOnly) {
            System.out.println(file.getName());
        }

        //В listFile можно передать объект интерфейса FileFilter
        //В данном интерфейсе есть только один метод, который принимает файл
        //и возвращает true/false в зависимости от того, подходит ли файл или нет
        File[] filesOnly2 = folder.listFiles(new FileOnlyFilter());
        for (File file : filesOnly2) {
            System.err.println(file.getName());
        }

        File folder2 = new File("C:\\Windows\\system32");
        //В listFile можно передать объект интерфейса FilenameFilter
        //В данном интерфейсе есть только один метод, который принимает имя файла
        //и ссылку на папку, где он находится
        //и возвращает true/false в зависимости от того, подходит ли файл или нет
        File[] exeFilesOnly = folder2.listFiles(new OnlyExeFilter());
        for (File file : exeFilesOnly) {
            System.out.println(file.getName());
        }


    }

}

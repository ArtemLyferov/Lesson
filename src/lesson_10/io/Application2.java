package lesson_10.io;

import java.io.File;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        //Класс, представляющий собой какое-то имя (по этому имени может быть
        //файл на диске, так его и не может быть
        File file = new File("C:\\out.properties");

        //File file = new File("C:\\Windows\\System32\\authfwcfg.dll");
        //Является исполняемым?
        System.out.println(file.canExecute());
        //Можно читать?
        System.out.println(file.canRead());
        //Можно писать?
        System.out.println(file.canWrite());

        //Длина файла (размер в байтах)
        System.out.println(file.length());

        //Существует ли файл
        System.out.println(file.exists());

        //Удаление файла
        //System.out.println(file.delete());

        //Является ли путь абсолютным
        System.out.println(file.isAbsolute());
        //Указывает ли путь на папку
        System.out.println(file.isDirectory());
        //Указывает ли путь на файл (не папку)
        System.out.println(file.isFile());
        //Является ли файл скрытым
        System.out.println(file.isHidden());

        //Папка, в которой этот файл находится
        System.out.println(file.getParent());

        //Время, когда файл был изменен, в милисекундах, начиная с 1.01.1970
        System.out.println(file.lastModified());

        //Вернуть абсолютный путь к этому файлу
        System.out.println(file.getAbsoluteFile());


        File file1 = new File("C:\\out2.properties");
        //Создание пустого файла
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}

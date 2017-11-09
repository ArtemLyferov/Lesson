package lesson_10.io;

import java.io.File;
import java.io.FileFilter;

public class FileOnlyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isFile();
    }
}

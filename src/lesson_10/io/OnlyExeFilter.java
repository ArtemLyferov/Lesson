package lesson_10.io;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExeFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".exe");
    }

}

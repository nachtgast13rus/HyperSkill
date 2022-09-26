package javaCore.iostream.file;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/test.txt");

//        file.createNewFile();
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        File dir = new File("/src/main/resources/testDir/");
        dir.mkdir();
        dir.list();
        dir.createNewFile();

    }
}

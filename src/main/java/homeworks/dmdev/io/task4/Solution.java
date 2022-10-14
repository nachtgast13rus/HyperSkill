package homeworks.dmdev.io.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "Main", "java", "homeworks", "dmdev", "io", "task4", "text.txt");
        String string = Files.readString(path);
        string = string.replace("public", "private");

        Path resultPAth = Path.of("src", "Main", "java", "homeworks", "dmdev", "io", "task4", "output.txt");
        Files.writeString(resultPAth, string);
    }

}

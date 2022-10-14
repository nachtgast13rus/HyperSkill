package homeworks.dmdev.io.task2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "Main", "java", "homeworks", "dmdev", "io", "task2", "text.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstChar = word.toUpperCase(Locale.ROOT).charAt(0);
                char lastChar = prev.toUpperCase(Locale.ROOT).charAt(prev.length() - 1);
                if (firstChar == lastChar) {
                    System.out.println(prev + " " + word);
                }
                prev = word;

            }
        }


    }
}


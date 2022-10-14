package homeworks.dmdev.io.task1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

/**
 * Вывести все слова из файла которые начинаются с гласной буквы
 */

public class Solution {
    public static final String VOWELS = "AEIOUY";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "Main", "java", "homeworks", "dmdev", "io", "task1", "text.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char ch = word.toUpperCase(Locale.ROOT).charAt(0);
                if (VOWELS.indexOf(ch) != -1) {
                    System.out.println(word);
                }
            }
        }


    }
}

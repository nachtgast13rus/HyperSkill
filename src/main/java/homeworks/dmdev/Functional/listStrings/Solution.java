package homeworks.dmdev.Functional.listStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Дан список строк. Найти количество уникальных строк длинной более 8 символов
 */
public class Solution {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "aaaaaaaaaaaaa",
                "vvvvvvvvvv", "cccc",
                "aaaaaaaa", "aaaaaaaa",
                "bbbbbbbbb", "bbbbbbbbb");

        int count = (int) strings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .peek(System.out::println)
                .count();

        System.out.println(count);
    }
}

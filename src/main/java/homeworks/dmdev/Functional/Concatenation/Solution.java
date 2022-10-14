package homeworks.dmdev.Functional.Concatenation;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список целых чисел, вывести строку предстовляющую собой конкатенацию строковых предстовлений этих чисел
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 4,
                                         3, 2, 1);
        String collect = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
//                .collect(Collectors.joining(","));
//                .collect(Collectors.joining("","Start: ", " End"));
        System.out.println(collect);
    }
}

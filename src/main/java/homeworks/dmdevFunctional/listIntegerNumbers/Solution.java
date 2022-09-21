package homeworks.dmdevFunctional.listIntegerNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Дан список целых чисел, вывести среденее значение всех нечетных чисел делящихся на 5
 */

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> intNumbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            intNumbers.add(random.nextInt(100));
        }

//        intNumbers.forEach(System.out::println);
        intNumbers.stream()
                .filter(x -> x % 2 != 0)
                .filter(x -> x % 5 == 0)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .average()
                .ifPresentOrElse(System.out::println,
                                () -> System.out.println("Value not found"));
    }
}

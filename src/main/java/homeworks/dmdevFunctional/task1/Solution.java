package homeworks.dmdevFunctional.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Написать метод который принимает целочисленный список и возвращает новый список с только нечетными
 * значениями.
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumber = oddNumberV1(integers);
        System.out.println(oddNumber);
    }

    public static List<Integer> oddNumberV1(List<Integer> list) {
        return list.stream()
                .filter(value -> value % 2 != 0)
                .collect(Collectors.toList());
    }
}

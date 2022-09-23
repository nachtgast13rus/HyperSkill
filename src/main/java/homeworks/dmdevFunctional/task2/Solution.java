package homeworks.dmdevFunctional.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;



/**
 * написать метод countUnique который принимает целочисленный список и возвращает количество
 * уникальных элементов если список пуст возвращает 0
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(integers));
    }

    public static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }
}

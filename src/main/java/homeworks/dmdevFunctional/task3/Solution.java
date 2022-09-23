package homeworks.dmdevFunctional.task3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * написать метод который принимает мар и возвращает true если у каждого ключа уникальное значение
 */
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
        "Marty", "Stepp",
        "Stuart", "Reges",
        "Jessica", "Miller",
        "Amanda", "Camp",
        "Hal", "Stepp");

        Set <String> set = new HashSet<>();

        System.out.println(map.size() == new HashSet<>(map.values()).size());
    }
}

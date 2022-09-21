package homeworks.dmdevFunctional.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Дана Map<String, Integer>, найти сумму всех значений длинна ключей которых меньше семи символов
 */
public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Suravenkov", 50000);
        map.put("Shkurov", 50000);
        map.put("Tyagushev", 450000);
        map.put("Deryabin", 40000);
        map.put("Petrov", 40000);
        map.put("Koryakov", 40000);
        map.put("Lobachev", 40000);
        map.put("Kosov", 40000);
        map.put("Chevtaev", 35000);
        map.put("Babanov", 35000);

        map.entrySet().stream()
                .filter(s -> s.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
        System.out.println("***********************************");
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);

    }
}

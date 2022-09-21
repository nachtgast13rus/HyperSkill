package javaCore.functional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> numberList = List.of("11", "99", "33", "88", "55", "66", "55", "90", "53", "12");
        numberList.stream()
                .map(value -> value.replace("1", "5"))
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .mapToInt(Integer::intValue)
                .map(s -> s++)
                .mapToObj(Integer::valueOf)
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("**********************************************************");

        IntStream.range(1, 10)
                .map(value -> value + random.nextInt())
                .filter(value -> value > 0)
                .sorted()
                .forEach(System.out::println);
        System.out.println("**********************************************************");

        ArrayList<Integer> salary = new ArrayList<>();
        Collections.addAll(salary, 40000, 45000, 35000, 45000, 35000, 50000, 45000, 50000, 35000);
        List<Integer> bigSalary = salary.stream()
                .filter(s -> s >= 45000).toList();
        bigSalary.forEach(System.out::println);
        System.out.println("**********************************************************");

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Ivan", "Petr", "Semen", "Oleg", "Ivan", "Oleg", "Petr", "Ivan");
        List<String> newName = names.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        newName.forEach(System.out::println);
        System.out.println("**********************************************************");
        SummaryExample.Summary();
    }


}

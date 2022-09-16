package javaCore.functional;

import java.util.List;
import java.util.Random;
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
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
        IntStream.range(1, 10)
                .map(value -> value + random.nextInt())
                .filter(value -> value > 0)
                .sorted()
                .forEach(System.out::println);
    }


}

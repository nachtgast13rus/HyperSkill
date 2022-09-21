package javaCore.functional.MapReduce;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static List<Workers> createWorkers() {
        List<Workers> workers = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            workers.add(new Workers(i, (int) ((Math.random() * (101 - 1)) + 1)));
        }
        return workers;
    }

    public static void maxAgeWorkers(List<Workers> workers) {
        workers.stream()
                .parallel()
                .map(Workers::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        List<Workers> workers = createWorkers();
        maxAgeWorkers(workers);

    }
}

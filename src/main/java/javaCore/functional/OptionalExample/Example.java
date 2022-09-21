package javaCore.functional.OptionalExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Workers> workers = createWorkers();
    }

    public static List<Workers> createWorkers() {
        List<Workers> workers = new ArrayList<>();
        Collections.addAll(workers,
                new Workers("Shkurov", 30, 50000),
                new Workers("Suravenkov", 35, 50000),
                new Workers("Tyagushev", 37, 40000),
                new Workers("Deryabin", 42, 40000),
                new Workers("Petrov", 45, 40000),
                new Workers("Koryakov", 27, 40000),
                new Workers("Lobachev", 39, 40000),
                new Workers("Babanov", 41, 35000),
                new Workers("Chevtaev", 43, 40000));
        return workers;
    }
}

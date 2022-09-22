package javaCore.functional.gruppingBy;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        List<Worker> workerList = List.of(
                new Worker("Suravenkov", 35, 50000, "director"),
                new Worker("Shkurov", 33, 50000, "director"),
                new Worker("Tyagushev", 37, 45000, "boss"),
                new Worker("Deryabin", 43, 40000, "shooter"),
                new Worker("Petrov", 45, 40000, "shooter"),
                new Worker("Koryakov", 32, 40000, "shooter"),
                new Worker("Kosov", 31, 40000, "driver"),
                new Worker("Lobachev", 38, 40000, "sorter"),
                new Worker("Babanov", 39, 35000, "sorter"),
                new Worker("Chevtaev", 47, 35000, "loader")
        );

        workerList.forEach(System.out::println);

        Map<String, List<Worker>> workerMap = workerList.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));

        for (Map.Entry<String, List<Worker>> map : workerMap.entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue());
        }

    }

}

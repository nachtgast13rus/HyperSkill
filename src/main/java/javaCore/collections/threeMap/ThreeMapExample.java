package javaCore.collections.threeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ThreeMapExample {
    public static void main(String[] args) {
        Person shkurov = new Person(1, "Shkurov", 5000);
        Person petrov = new Person(2, "Petrov", 40000);
        Person chevtaev = new Person(3, "Chevtaev", 35000);

        Map<Integer, Person> workers = new TreeMap<>();
        workers.put(shkurov.getId(), shkurov);
        workers.put(petrov.getId(), petrov);
        workers.put(chevtaev.getId(), chevtaev);

        for (Map.Entry<Integer, Person> entry : workers.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}

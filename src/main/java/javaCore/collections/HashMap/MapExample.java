package javaCore.collections.HashMap;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println("*******************************");
        System.out.println(map.keySet());
        System.out.println("*******************************");
        System.out.println(map.values());
        System.out.println("*******************************");
        System.out.println(map.entrySet());
        System.out.println("*******************************");

        for (Person person: map.values()) {
            System.out.println(person.getLastName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue().getLastName());
        }

        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue(ivan));
    }
}

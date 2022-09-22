package javaCore.collections.sortCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "3", "5", "7", "9", "2", "4", "6", "8");
        strings.forEach(System.out::println);

        Collections.sort(strings);
        strings.forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(3, "Petr", "Petrov"),
                new Person(2, "Sidor", "Sidorov")
        );
        System.out.println(people);
        people.sort(Person::compareTo);
        System.out.println(people);

        people.sort(new FirstNameComparator());
        System.out.println(people);

        people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getId));
        System.out.println(people);
    }

    public static class FirstNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}



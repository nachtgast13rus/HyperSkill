package homeworks.dmdev.Functional.NameOldestMan;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Вывести полное имя самого старого человека длинна имени которого не превышает 15 символов
 */
public class Solution {
    public static void main(String[] args) {
        List<Person> workers = List.of(
                new Person("Sergey", "Suravenkov", 34),
                new Person("Dmitry", "Shkurov", 32),
                new Person("Dmitry", "Tygushev", 37),
                new Person("Sergey", "Kosov", 31),
                new Person("Oleg", "Deryabin", 42),
                new Person("Oleg", "Petrov", 45),
                new Person("Vlad", "Koryakov", 33),
                new Person("Oleg", "Lobachev", 39),
                new Person("Nikolay", "Chevtaev", 46),
                new Person("Alexandr", "Babanov", 40)
                );

        workers.stream()
                .filter(person -> person.getFirstName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<Person>> map = workers.stream()
                .collect(Collectors.groupingBy(Person::getAge));

    }
}

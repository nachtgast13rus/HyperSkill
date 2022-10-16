package javaCore.functional.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> isNotNull = Objects::nonNull;
        Predicate<String> isEmpty = (str) -> !str.isEmpty();
        Predicate<String> isStartJOrN = (str) -> (str.startsWith("J") || str.startsWith("N")) && str.endsWith("A");

        System.out.println(isNotNull.test(null));
        System.out.println(isEmpty.test("fd"));
        System.out.println(isNotNull.and(isEmpty).test("Java"));
        System.out.println(isStartJOrN.test("Google"));
        System.out.println(isStartJOrN.test("Java"));

    }
}

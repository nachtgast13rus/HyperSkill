package javaCore.functional.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s + "1";
        Function<String, String> f2 = s -> s + "2";
        Function<String, String> f3 = s -> s + "3";
        Function<String, String> f4 = s -> s + "4";
        System.out.println(f1.andThen(f2).compose(f3).compose(f4).apply("Compose"));
        System.out.println(f1.andThen(f2).andThen(f3).apply("AndThen"));

        Function<Integer, String> print = value -> {
            String message = "Null";
            if (value > 0) {
                message = "Positive";
            } else if (value < 0) {
                message = "Negative";
            }
            return message;
        };
        System.out.println(print.apply(5));
        System.out.println(print.apply(-5));
        System.out.println(print.apply(0));


    }
}

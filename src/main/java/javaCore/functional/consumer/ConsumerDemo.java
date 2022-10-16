package javaCore.functional.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<HeavyBox> loadBox = heavy -> System.out.println("Load box: weight = " + heavy.getWeight());
        Consumer<HeavyBox> goBox = heavy -> System.out.println("Go box: weight = " + heavy.getWeight());
        loadBox.andThen(goBox).accept(new HeavyBox(10));
    }
}

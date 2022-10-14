package javaCore.multithreading.tread;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}

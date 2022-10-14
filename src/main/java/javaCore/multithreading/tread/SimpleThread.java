package javaCore.multithreading.tread;

import java.util.Scanner;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + getName());
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}

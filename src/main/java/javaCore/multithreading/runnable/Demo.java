package javaCore.multithreading.runnable;

public class Demo {
    public static void main(String[] args) {
        Thread simpleRunnable = new Thread(new SimpleRunnable(), "Runnable");
        Thread lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()), "lambda");

        simpleRunnable.start();
        lambdaThread.start();

        try {
            simpleRunnable.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Hello from Main: " + Thread.currentThread().getName());
    }
}

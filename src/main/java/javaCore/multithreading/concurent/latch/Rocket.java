package javaCore.multithreading.concurent.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Rocket getting ready to launch...");
        try {
            countDownLatch.await();
            System.out.println("Start!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

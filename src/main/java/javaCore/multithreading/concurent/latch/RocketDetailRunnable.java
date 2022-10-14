package javaCore.multithreading.concurent.latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable {


    private final RocketDetail rocketDetail;
    private final CountDownLatch countDownLatch;

    public RocketDetailRunnable(RocketDetail rocketDetail, CountDownLatch countDownLatch) {
        this.rocketDetail = rocketDetail;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Detail is being prepared: " + rocketDetail);
        try {
            Thread.sleep(1000L);
            System.out.println("Detail is prepared: " + rocketDetail);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

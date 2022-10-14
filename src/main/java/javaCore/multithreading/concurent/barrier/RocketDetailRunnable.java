package javaCore.multithreading.concurent.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {


    private final RocketDetail rocketDetail;
    private final CyclicBarrier cyclicBarrier;

    public RocketDetailRunnable(RocketDetail rocketDetail, CyclicBarrier cyclicBarrier) {
        this.rocketDetail = rocketDetail;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Detail is being prepared: " + rocketDetail);
        try {
            Thread.sleep(1000L);
            System.out.println("Detail is prepared and waiting: " + rocketDetail);
            cyclicBarrier.await();
            System.out.println("Detail used: " + rocketDetail);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

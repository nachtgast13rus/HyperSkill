package javaCore.multithreading.concurent.semapfore;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {
    private final Semaphore cashboxes;

    public BuyerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            cashboxes.acquire();
            System.out.println(Thread.currentThread().getName() + " in some cashbox");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " is free some cashbox");
            cashboxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


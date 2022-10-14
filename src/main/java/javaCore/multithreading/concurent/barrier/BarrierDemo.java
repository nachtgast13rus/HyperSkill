package javaCore.multithreading.concurent.barrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier =
                new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("Start"));

        ExecutorService executorService = Executors.newCachedThreadPool();
        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunnable(detail, cyclicBarrier))
                .forEach(executorService::submit);

        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
    }
}

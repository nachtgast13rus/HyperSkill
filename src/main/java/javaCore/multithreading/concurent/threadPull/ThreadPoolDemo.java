package javaCore.multithreading.concurent.threadPull;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        Executors.newSingleThreadExecutor();  // 1 threa
//        Executors.newCachedThreadPool();  //
//        Executors.newScheduledThreadPool(5);
//        Executors.newWorkStealingPool();
        System.out.println("Start");
        ExecutorService threadPool = Executors.newFixedThreadPool(5);// 5 threads
        Future<Integer> future = threadPool.submit(() -> {
            System.out.println("Hello, world!");
            return 5;
        });
        threadPool.submit(ThreadPoolDemo::sayWord);
        threadPool.submit(() -> adding(5, 6));
        Future<Integer> result = threadPool.submit(() -> returnAdding(7, 8));
        System.out.println(result.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("End");
    }

    public static void sayWord() {
        System.out.println("Evgen is fogot");
    }

    public static void adding(int x, int y) {
        System.out.println(x + y);
    }

    public static Integer returnAdding(int x, int y) {
        return x + y;
    }
}

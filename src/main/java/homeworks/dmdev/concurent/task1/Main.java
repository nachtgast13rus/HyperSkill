package homeworks.dmdev.concurent.task1;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            executorService.submit(() -> {
                Integer count = threadLocal.get();
                threadLocal.set(count == null ? 1 : ++count);
                System.out.println(threadLocal.get());
                Thread.sleep(number * 1000L);
                System.out.printf("Thread sleep %d seconds\n", number);
                return number;
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
    }
}

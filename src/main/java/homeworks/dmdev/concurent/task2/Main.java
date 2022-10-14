package homeworks.dmdev.concurent.task2;

import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Random random = new Random();

        int[] array = new int[random.nextInt(1_000_000)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }
        trackTime(() -> {
            try {
                return findMaxV1(array);
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        trackTime(() -> findMaxV2(array));
        trackTime(() -> {
            try {
                return findMaxV3(array, executorService);
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();
    }

    private static int trackTime(Supplier<Integer> task) {
        long startTime = System.currentTimeMillis();
        int result = task.get();
        System.out.println(result + ": " + (System.currentTimeMillis() - startTime));
        return result;
    }

    public static int findMaxV1(int[] array) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> submit = executorService.submit(() -> {
            int maxNumber = array[0];
            for (int j : array) {
                if (j >= maxNumber) {
                    maxNumber = j;
                }
            }
            return maxNumber;
        });
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
        return submit.get();
    }

    public static int findMaxV2(int[] array) {
        return IntStream.of(array)
                .max()
                .orElse(-1);
    }

    public static int findMaxV3(int[] array, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() -> IntStream.of(array)
                .parallel()
                .max()
                .orElse(-1)).get();
    }
}

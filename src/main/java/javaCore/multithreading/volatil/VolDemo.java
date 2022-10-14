package javaCore.multithreading.volatil;

public class VolDemo {
    private static volatile boolean flag;

    public static void main(String[] args) throws InterruptedException {
        final int[] count = {0};
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("still false " + count[0]);
                count[0]++;
            }
        });
        thread1.start();
        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("flag is set");
        });
        thread2.start();
    }
}

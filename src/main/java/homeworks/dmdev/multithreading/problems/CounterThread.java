package homeworks.dmdev.multithreading.problems;

public class CounterThread extends Thread {
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
        }
    }
}

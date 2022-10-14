package homeworks.dmdev.multithreading.problems;

public class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
}

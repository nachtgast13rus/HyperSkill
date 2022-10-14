package homeworks.dmdev.multithreading.problems;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        CounterThread first = new CounterThread(counter);
        CounterThread second = new CounterThread(counter);
        CounterThread third = new CounterThread(counter);
        CounterThread fourth = new CounterThread(counter);

        first.start();
        second.start();
        third.start();
        fourth.start();

        try {
            first.join();
            second.join();
            third.join();
            fourth.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}

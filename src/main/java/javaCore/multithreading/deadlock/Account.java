package javaCore.multithreading.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final Lock lock = new ReentrantLock();
    private static int generator = 1;
    private int id;
    private int money;

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        } else {
            return false;
        }
    }

    public Lock getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }

    public Account(int money) {
        this.id = generator++;
        this.money = money;
    }
}

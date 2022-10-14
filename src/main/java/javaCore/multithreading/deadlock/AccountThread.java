package javaCore.multithreading.deadlock;

public class AccountThread extends Thread {
    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }


    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            lockAccount();
            try {
                if (accountFrom.takeOff(10)) {
                    accountTo.add(10);
                }
            } finally {
                accountTo.getLock().unlock();
                accountFrom.getLock().unlock();
            }
        }
    }

    private void lockAccount() {
        while (true) {
            boolean fromLockResult = accountFrom.getLock().tryLock();
            boolean toLockResult = accountTo.getLock().tryLock();

            if (fromLockResult && toLockResult) {
                break;
            }
            if (fromLockResult) {
                accountFrom.getLock().unlock();
            }
            if (toLockResult) {
                accountTo.getLock().unlock();
            }
        }
    }


}

import java.util.concurrent.locks.ReentrantLock;

class Account {
    int balance;
    ReentrantLock lock = new ReentrantLock();

    Account(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void deposit(int amount) {
        balance += amount;
    }

    int getBalance() {
        return balance;
    }
}

class TransferThread extends Thread {
    Account fromAccount;
    Account toAccount;
    int amount;

    TransferThread(Account from, Account to, int amount) {
        this.fromAccount = from;
        this.toAccount = to;
        this.amount = amount;
    }

    public void run() {
        fromAccount.lock.lock();
        try {
            toAccount.lock.lock();
            try {
                if (fromAccount.getBalance() >= amount) {
                    fromAccount.withdraw(amount);
                    toAccount.deposit(amount);
                    System.out.println(getName() + " transferred " + amount);
                } else {
                    System.out.println(getName() + ": Not enough balance to transfer " + amount);
                }
            } finally {
                toAccount.lock.unlock();
            }
        } finally {
            fromAccount.lock.unlock();
        }
    }
}

public class Q24 {
    public static void main(String[] args) {
        Account acc1 = new Account(1000);
        Account acc2 = new Account(1000);

        TransferThread t1 = new TransferThread(acc1, acc2, 300);
        TransferThread t2 = new TransferThread(acc2, acc1, 500);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}

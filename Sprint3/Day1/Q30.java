import java.util.concurrent.locks.ReentrantLock;

class SharedCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();  
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        } finally {
            lock.unlock(); 
        }
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private final SharedCounter counter;

    MyThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q30 {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        MyThread t3 = new MyThread(counter);

        t1.start();
        t2.start();
        t3.start();
    }
}

class SharedBuffer {
    private int item;
    private boolean hasItem = false;


    public synchronized void produce(int value) throws InterruptedException {
        while (hasItem) {
            wait(); 
        }
        item = value;
        hasItem = true;
        System.out.println("Produced: " + value);
        notify(); 
    }

    // Consumer takes item
    public synchronized int consume() throws InterruptedException {
        while (!hasItem) {
            wait(); 
        }
        hasItem = false;
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consume();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q29 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

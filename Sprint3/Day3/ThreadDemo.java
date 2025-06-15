class ThreadDemo extends Thread {

    private Thread threadInstance;
    private final String threadIdentifier;

    ThreadDemo(String threadName) {
        threadIdentifier = threadName;
        System.out.println("Instantiating " + threadIdentifier);
    }

    @Override
    public void run() {
        System.out.println("Executing " + threadIdentifier);
        try {
            for (int iteration = 4; iteration > 0; iteration--) {
                System.out.println("Thread: " + threadIdentifier + ", " + iteration);
                Thread.sleep(50);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread " + threadIdentifier + " encountered an interruption.");
        }
        System.out.println("Thread " + threadIdentifier + " terminating.");
    }

    public synchronized void initiate() {
        System.out.println("Commencing " + threadIdentifier);
        if (threadInstance == null) {
            threadInstance = new Thread(this, threadIdentifier);
            threadInstance.start();
        }
    }
}


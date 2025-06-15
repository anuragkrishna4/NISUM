public class RunnableDemp implements Runnable{
    private Thread threadInstance;
    private String nameOfThread;
    
    public RunnableDemp(String name) {
        this.nameOfThread = name;
        System.out.println("Initiating Thread: " + nameOfThread);
    }

    public void run(){
        System.out.println("Executing Thread: " + nameOfThread);
        try {
            for
            (int counter=4; counter > 0; counter--) {
                System.out.println("Thread: " + nameOfThread + ", iteration: " + counter);
                // Simulating some work with sleep
                Thread.sleep(50);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread " + nameOfThread + "execution was interrupted.");
        }
        System.out.println("Thread " + nameOfThread + " exiting execution.");
    }

    public void start() {
        System.out.println("Commening Thread: " + nameOfThread);
        if (threadInstance == null) {
            threadInstance = new Thread(this, nameOfThread);
            threadInstance.start();
        }
    }
}


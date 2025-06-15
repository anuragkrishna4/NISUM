
public class TestThread {
    public static void main(String[] args) {
        RunnableDemp runnanbleTask1= new RunnableDemp("Thread-1");
        runnanbleTask1.start();
        
        RunnableDemp runnableTask2 = new RunnableDemp("Thread-2");
        runnableTask2.start();

    }
}

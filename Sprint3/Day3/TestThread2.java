public class TestThread2 {

    public static void main(String[] arguments) {
        ThreadDemo threadOne = new ThreadDemo("Thread-1");
        threadOne.initiate();

        ThreadDemo threadTwo = new ThreadDemo("Thread-2");
        threadTwo.initiate();
    }
}
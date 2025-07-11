public class Q21 {

    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(300); 
                } catch (InterruptedException e) {
                    System.out.println("EvenThread interrupted");
                }
            }
        }
    }
    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("OddThread interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start(); 
        odd.start(); 
    }
}

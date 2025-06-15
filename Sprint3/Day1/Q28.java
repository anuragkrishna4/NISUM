import java.util.Scanner;

class PrimeSumThread extends Thread {
    int start, end;
    int sum = 0;

    PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int getSum() {
        return sum;
    }
}

public class Q28 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        int mid = limit / 2;

        PrimeSumThread t1 = new PrimeSumThread(1, mid);
        PrimeSumThread t2 = new PrimeSumThread(mid + 1, limit);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int total = t1.getSum() + t2.getSum();
        System.out.println("Sum of primes up to " + limit + " = " + total);
    }
}

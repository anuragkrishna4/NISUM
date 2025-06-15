class MultiplyRowThread extends Thread {
    int row;
    int[][] A, B, result;

    MultiplyRowThread(int row, int[][] A, int[][] B, int[][] result) {
        this.row = row;
        this.A = A;
        this.B = B;
        this.result = result;
    }

    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            result[row][j] = 0;
            for (int k = 0; k < B.length; k++) {
                result[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}

public class Q27 {
    public static void main(String[] args) throws InterruptedException {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int rowsA = A.length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        MultiplyRowThread[] threads = new MultiplyRowThread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MultiplyRowThread(i, A, B, result);
            threads[i].start();
        }

        for (int i = 0; i < rowsA; i++) {
            threads[i].join();
        }

        System.out.println("Result Matrix:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

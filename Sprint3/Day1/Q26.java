import java.util.Arrays;

class SortPart extends Thread {
    int[] part;

    SortPart(int[] part) {
        this.part = part;
    }

    public void run() {
        Arrays.sort(part);  
    }
}

public class Q26 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {9, 3, 7, 1, 5, 4, 2, 6};
        int mid = arr.length / 2;

        int[] part1 = Arrays.copyOfRange(arr, 0, mid);
        int[] part2 = Arrays.copyOfRange(arr, mid, arr.length);

        SortPart t1 = new SortPart(part1);
        SortPart t2 = new SortPart(part2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int[] sorted = merge(part1, part2);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array:   " + Arrays.toString(sorted));
    }


    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            result[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }
}

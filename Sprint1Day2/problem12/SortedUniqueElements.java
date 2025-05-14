import java.util.*;

public class SortedUniqueElements {
    public static Set<Integer> getSortedUniqueElements(int[] arr) {
        TreeSet<Integer> uniqueSortedSet = new TreeSet<>();
        for (int num : arr) {
            uniqueSortedSet.add(num);
        }
        return uniqueSortedSet;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 3, 1, 5, 2, 8};
        Set<Integer> result = getSortedUniqueElements(array);
        System.out.println("Sorted Unique Elements: " + result);
    }
}

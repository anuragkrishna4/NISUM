import java.util.*;

public class CommonElementsFinder {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        List<Integer> common = new ArrayList<>();

        for (int num : list2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> result = findCommonElements(list1, list2);
        System.out.println("Common Elements: " + result);
    }
}


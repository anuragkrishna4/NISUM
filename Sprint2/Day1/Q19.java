import java.util.*;
import java.util.stream.*;

public class Q19 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Apricot");
        List<String> result = names.stream()
                                   .filter(s -> s.startsWith("A"))
                                   .collect(Collectors.toList());
        System.out.println("Strings starting with A: " + result);
    }
}

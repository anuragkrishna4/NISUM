//Sort a list of string in descending(reverse Alphabetical) order. List<String> fruits = List of("apple", "banana", "cherry", "date");

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class cwQ4 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry", "date");
        List<String> sorted = sortFruitsInDescendingOrder(fruits);
        System.out.println(sorted);
    }

    public static List<String> sortFruitsInDescendingOrder(List<String> fruits){
        return fruits.stream()
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.toList());
    }
    
}

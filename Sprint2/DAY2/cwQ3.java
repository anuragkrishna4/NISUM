// find the first string that starts with leter "C". list<String> names= List.of("Alice", "Bob", "Charlie", "David"); 

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class cwQ3 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David","Chandani");
        List<String> result = findFirstNameStartingWithC(names);
        System.out.println(result);
    }

    public static List<String> findFirstNameStartingWithC(List<String> names) {
        return names.stream()
                    .filter(name -> name.startsWith("C"))
                    .collect(Collectors.toList());
    }
    
}

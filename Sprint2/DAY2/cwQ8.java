import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class cwQ8 {
public static void main(String[] args) {
    List<String>words = List.of("Alice", "Arnold", "Bob", "Charlie", "Andrew");
    List<String> result = stringsStartsWithLetterA(words);
    System.out.println(result.size());
}
public static List<String> stringsStartsWithLetterA(List<String> words) {
    return words.stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());
    
}
}

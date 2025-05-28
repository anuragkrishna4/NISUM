//group word by their length.List<String> words = List.of("one", "two", "three", "four", "five");

import java.util.List;
import java.util.stream.Collectors;


public class cwQ6 {
    public static void main(String[] args) {
        List<String> words = List.of("one", "two", "three", "four", "five");
        System.out.println(groupWordsByLength(words));
    }
    public static List<String> groupWordsByLength(List<String> words){
        return words.stream()

    }
}

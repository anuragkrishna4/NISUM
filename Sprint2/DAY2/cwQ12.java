
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class cwQ12 {
    public static void main(String[] args) {
        List<String> sentences = List.of("Java is fun", "streams are powerful", "java is powerfull");
        Map<String,Integer> result = frequencyOfWords(sentences);
        System.out.println(result);
    }

    public static Map<String,Integer> frequencyOfWords(List<String> sentences) {
        return sentences.stream()
                .flatMap(sentence -> Stream.of(sentence.split(" "))) // Split each sentence into words
                .collect(Collectors.toMap( // Collect words into a map with their frequency
                        word -> word.toLowerCase(), // Use lowercase for case-insensitive comparison
                        word -> 1, // Initial count is 1
                        Integer::sum // If the word already exists, sum the counts
                ));
    }
    
}

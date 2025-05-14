import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a block of text:");
        String input = scanner.nextLine();

        
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] words = input.split("\\s+");

        
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        
        System.out.println("\nWord Frequency (Highest to Lowest):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}

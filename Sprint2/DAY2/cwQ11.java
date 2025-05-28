
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cwQ11 {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = getEvenNumbers(numbers);
        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
    public static List<Integer> getEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
    }
    public static List<Integer> getOddNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
    }
}

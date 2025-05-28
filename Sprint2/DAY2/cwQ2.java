//given a list of integers, return a list of only even numbers.List<Inter> nmbers = List.of(1,2,3,4,5,6);

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cwQ2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = getEvenNumbers(numbers);
        System.out.println(evenNumbers);
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .collect(Collectors.toList());
    }
}
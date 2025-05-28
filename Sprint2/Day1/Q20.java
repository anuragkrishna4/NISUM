import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Q20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 9, 12);
        
        Predicate<Integer> divisibleBy2 = n -> n % 2 == 0;
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;

        List<Integer> andResult = numbers.stream()
                                         .filter(divisibleBy2.and(divisibleBy3))
                                         .collect(Collectors.toList());
        
        List<Integer> orResult = numbers.stream()
                                        .filter(divisibleBy2.or(divisibleBy3))
                                        .collect(Collectors.toList());

        System.out.println("Divisible by both 2 and 3: " + andResult);
        System.out.println("Divisible by 2 or 3: " + orResult);
    }
}

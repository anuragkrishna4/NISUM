// Q23_ConsumerDouble.java
import java.util.*;
import java.util.function.*;

public class Q23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> doubler = n -> System.out.println(n * 2);
        numbers.forEach(doubler);
    }
}

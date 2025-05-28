import java.util.*;
import java.util.function.*;

public class Q22 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "Rust");

        Consumer<String> printer = System.out::println;
        languages.forEach(printer);
    }
}

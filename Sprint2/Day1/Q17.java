import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C", "SpringBoot", "Go");

        list.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(list); 
    }
}

import java.util.function.*;

public class Q21 {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number " + (i + 1) + ": " + randomSupplier.get());
        }
    }
}

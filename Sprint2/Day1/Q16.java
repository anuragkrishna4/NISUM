@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Q16 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(add.operate(10, 5));      
        System.out.println(subtract.operate(10, 5)); 
        System.out.println(multiply.operate(10, 5));
    }
}

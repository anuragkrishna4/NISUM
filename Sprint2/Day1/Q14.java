interface B {
    static int square(int x) {
        return x * x;
    }
}

public class Q14 {
    public static void main(String[] args) {
        int result = B.square(5);
        System.out.println(result); 
    }
}

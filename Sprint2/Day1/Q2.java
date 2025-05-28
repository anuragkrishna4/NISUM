interface I1 {
    static void m1() {
        System.out.println("Static method in interface called!");
    }
}

public class Q2 {
    public static void main(String[] args) {
        I1.m1();
    }
}
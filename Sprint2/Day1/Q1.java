interface I1{
    default void m1() {
        System.out.println("m1");
    }
}

public class Q1 implements I1 {
    public void m1() {
        System.out.println("m1 in I1");
    }

    public static void main(String[] args) {
        I1 i = new Q1();
        i.m1(); 
    }
}
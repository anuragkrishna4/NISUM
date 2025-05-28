interface A {
    default void run() {
        System.out.println("Run from A");
    }
}

class Q13 implements A {
    @Override
    public void run() {
        System.out.println("Run from class Q13");
        A.super.run(); 
    }

    public static void main(String[] args) {
        new Q13().run();
    }
}

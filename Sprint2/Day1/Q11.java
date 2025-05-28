interface A {
    default void run() {
        System.out.println("Running from A");
    }
}

interface B {
    default void run() {
        System.out.println("Running from B");
    }
}

class  Q11  implements A, B {
    @Override
    public void run() {
        A.super.run(); 
        }

    public static void main(String[] args) {
        new Q11().run(); 
    }
}


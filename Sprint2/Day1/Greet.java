public interface Greet {
    default void sayy() {
        System.out.println("Hello from interface");
    }
}

class Q12 implements Greet {
    @Override
    public void sayy() {
        System.out.println("Hello from class");
        Greet.super.sayy(); 
    }

    public static void main(String[] args) {
        new Q12().sayy();
    }
}

interface I1 {
    default void show() {
        System.out.println("Default method in interface");
    }
}

public class cwQ3 implements I1 {
    @Override
    public void show() {
        System.out.println("Overridden default method in implementing class");
    }

    public static void main(String[] args) {
        cwQ3 obj = new cwQ3();
        obj.show();
    }
}
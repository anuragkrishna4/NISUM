// Outer class with a nested interface
class OuterClass {
    interface Interface1 {
        void showMessage();
    }
}

// Implementing the nested interface
class NestedInterface implements OuterClass.Interface1 {
    public void showMessage() {
        System.out.println("Nested interface method implemented.");
    }

    public static void main(String[] args) {
        OuterClass.Interface1 obj = new NestedInterface();
        obj.showMessage();
    }
}

class Child extends Parent {
    void show() {
        Parent.displayMessage();
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
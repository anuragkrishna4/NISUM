class StaticOverload {
    
    
    static void show() {
        System.out.println("Static method with no parameters.");
    }
    
    static void show(int a) {
        System.out.println("Static method with one int parameter: " + a);
    }

    public static void main(String[] args) {
        StaticOverload.show();
        StaticOverload.show(10);
    }
}

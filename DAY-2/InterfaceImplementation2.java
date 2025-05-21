
interface MyInterface {
    static void displayMessage() {
        System.out.println("Static method inside interface.");
    }
}

class InterfaceImplementation2 implements MyInterface {
    
    public void show() {
        System.out.println("Instance method inside DemoClass.");
    }
    public static void main(String[] args) {
        
        MyInterface.displayMessage();
        InterfaceImplementation2 obj = new InterfaceImplementation2();
        obj.show();
    }
}


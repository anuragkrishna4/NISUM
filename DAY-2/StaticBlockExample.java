//8
class StaticBlockExample {

    static int count;

    static {
        System.out.println("Static block executed.");
        count = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Value of count: " + count);
    }
}

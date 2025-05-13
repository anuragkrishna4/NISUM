class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 and 3: " + calc.add(2, 3));
        System.out.println("Addition of 4, 5 and 6: " + calc.add(4, 5, 6));
        System.out.println("Addition of 2.5 and 3.7: " + calc.add(2.5, 3.7));
    }
}


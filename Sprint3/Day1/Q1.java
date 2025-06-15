

import java.util.Scanner;
class Q1 {
    int a;
    int b;

    Q1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int divide() {
        try{
            if(b==0){
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0; 
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        division obj1 = new division(a,b);

        System.out.println("Result ="+ obj1.divide());
    }

    
}
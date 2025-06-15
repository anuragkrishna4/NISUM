import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q2 {
    
    public static void validateAge(int age) {
        try {
            if (age <= 0) {
                throw new InvalidAgeException("Invalid age: Age must be greater than zero.");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught some other Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        validateAge(age);
        sc.close();
    }
}

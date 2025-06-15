import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q3 {

    public static void validateAge(int age) {
        try {
            if (age <= 0) {
                throw new InvalidAgeException(age+" is Invalid age: Age must be greater than zero.");
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
        try (Scanner sc = new Scanner(new File("age.txt"))) {
            int age = sc.nextInt();
            validateAge(age);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

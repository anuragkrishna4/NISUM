
public class prob15 {
    public static void main(String[] args) {
        // Creating Student Objects
         Marks s1 = new Marks("Ravi", "NIT Delhi", 76, 89, 92);
         Marks s2 = new Marks("Sneha", "IIT Bombay", 84, 91, 87);

        // Displaying student details
        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}

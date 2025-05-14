package Sprint1Day2.problem2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Grade: ");
                    double grade = sc.nextDouble();
                    StudentManager.addStudent(id, name, grade);
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    StudentManager.removeStudent(removeId);
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    StudentManager.searchStudent(searchId);
                    break;

                case 4:
                    StudentManager.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Exiting Student Management System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

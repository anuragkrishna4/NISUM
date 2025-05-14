import java.util.HashSet;
import java.util.Scanner;

public class EmailManager {
    private static HashSet<String> emailSet = new HashSet<>();

    public static void addEmail(String email) {
        if (emailSet.add(email)) {
            System.out.println("Email added successfully.");
        } else {
            System.out.println("Duplicate email. Skipped.");
        }
    }

    public static void displayEmails() {
        if (emailSet.isEmpty()) {
            System.out.println("No emails to display.");
        } else {
            System.out.println("\nUnique Email Addresses:");
            for (String email : emailSet) {
                System.out.println(email);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Email Manager =====");
            System.out.println("1. Add Email");
            System.out.println("2. Display Unique Emails");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter email to add: ");
                    String email = sc.nextLine().trim().toLowerCase();
                    addEmail(email);
                    break;

                case 2:
                    displayEmails();
                    break;

                case 3:
                    System.out.println("Exiting Email Manager...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}

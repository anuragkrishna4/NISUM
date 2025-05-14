package Sprint1Day2.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n++++++ Shopping Cart Menu ++++++");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Items");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Item name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Item price:");
                    double price = sc.nextDouble();
                    System.out.println("Enter Item quantity:");
                    int quantity = sc.nextInt();
                    ShoppingCart.addItem(name, price, quantity);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter Item name to remove:");
                    String itemName = sc.nextLine();
                    ShoppingCart.removeItem(itemName);
                    break;
                case 3:
                    ShoppingCart.displayCart();
                    break;
                case 4:
                    ShoppingCart.calculateTotal();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 5);

        sc.close();
    }
}

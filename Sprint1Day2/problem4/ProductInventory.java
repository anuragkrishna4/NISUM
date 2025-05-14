import java.util.HashMap;
import java.util.Scanner;

public class ProductInventory {
    private static HashMap<String, Integer> inventory = new HashMap<>();

    public static void addProduct(String productName, int quantity) {
        inventory.put(productName, inventory.getOrDefault(productName, 0) + quantity);
        System.out.println(" Product added/updated: " + productName);
    }

    public static void updateQuantity(String productName, int newQuantity) {
        if (inventory.containsKey(productName)) {
            inventory.put(productName, newQuantity);
            System.out.println("Product quantity updated: " + productName);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    
    public static void removeProduct(String productName) {
        if (inventory.containsKey(productName)) {
            inventory.remove(productName);
            System.out.println("Product removed: " + productName);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    
    public static boolean checkStock(String productName) {
        return inventory.containsKey(productName) && inventory.get(productName) > 0;
    }


    public static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (String product : inventory.keySet()) {
                System.out.println(product + " - " + inventory.get(product));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductInventory inventory = new ProductInventory();
        int choice;

        do {
            System.out.println("\n===== Product Inventory Menu =====");
            System.out.println("1. Add/Update Product");
            System.out.println("2. Update Product Quantity");
            System.out.println("3. Remove Product");
            System.out.println("4. Check Stock");
            System.out.println("5. Display Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(productName, quantity);
                    break;
                case 2:
                    System.out.print("Enter product name to update: ");
                    String updateProductName = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    inventory.updateQuantity(updateProductName, newQuantity);
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    String removeProductName = scanner.nextLine();
                    inventory.removeProduct(removeProductName);
                    break;
                case 4:
                    System.out.print("Enter product name to check stock: ");
                    String checkProductName = scanner.nextLine();
                    boolean inStock = inventory.checkStock(checkProductName);
                    if (inStock) {
                        System.out.println( checkProductName + " is in stock.");
                    } else {
                        System.out.println( checkProductName + " is out of stock.");
                    }
                    break;
                case 5:
                    inventory.displayInventory();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }   
}

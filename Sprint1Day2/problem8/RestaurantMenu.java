import java.util.*;

public class RestaurantMenu {
    static LinkedHashMap<String, HashMap<String, MenuItem>> menu = new LinkedHashMap<>();

    static class MenuItem {
        String name;
        String description;
        double price;

        MenuItem(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public String toString() {
            return name + " - " + description + " - " + price;
        }
    }

    public static void addItem(String category, String name, String description, double price) {
        menu.putIfAbsent(category, new HashMap<>());
        menu.get(category).put(name, new MenuItem(name, description, price));
        System.out.println("Item added to " + category);
    }

    public static void removeItem(String category, String name) {
        if (menu.containsKey(category) && menu.get(category).remove(name) != null) {
            System.out.println("Item removed from " + category);
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void updateItem(String category, String name, String newDescription, double newPrice) {
        if (menu.containsKey(category) && menu.get(category).containsKey(name)) {
            menu.get(category).put(name, new MenuItem(name, newDescription, newPrice));
            System.out.println("Item updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty.");
            return;
        }
        for (String category : menu.keySet()) {
            System.out.println("\nCategory: " + category);
            for (MenuItem item : menu.get(category).values()) {
                System.out.println("  - " + item);
            }
        }
    }

    public static void main(String[] args) {
        addItem("Main Course", "Paneer Butter Masala", "Cottage cheese in creamy gravy", 250);
        addItem("Dessert", "Gulab Jamun", "Soft balls in sugar syrup", 90);
        addItem("Appetizer", "Garlic Bread", "Toasted bread with garlic butter", 80);

        displayMenu();

        updateItem("Appetizer", "Garlic Bread", "Cheesy garlic bread", 100);
        removeItem("Dessert", "Gulab Jamun");

        displayMenu();
    }
}


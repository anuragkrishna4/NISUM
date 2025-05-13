import java.util.*;

class cart {
    String itemName;
    double itemValue;
    int itemId;

    cart(String itemName,double itemValue,int itemId) {
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemId = itemId;
    }

    void displayItem() {
        System.out.println("Item ID: " + itemId + ", Name: " + itemName + ", Value: " + itemValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<cart> cartList = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " +(i + 1));
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter item value: ");
            double value = sc.nextDouble();
            System.out.print("Enter item ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            if (name.isEmpty() || value <= 0) {
                continue;
            }

            cart item = new cart(name, value, id);
            cartList.add(item);
        }

        double orderTotal = 0;
        int itemsCount = cartList.size();

        System.out.println("\nOrder Summary");
        for (int i = 0; i < cartList.size(); i++) {
            cart c = cartList.get(i);
            c.displayItem();
            orderTotal += c.itemValue;
        }        
        System.out.println("\nTotal Items: " + itemsCount);
        System.out.println("Order Total: " + orderTotal);
    }
}

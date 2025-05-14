package Sprint1Day2.problem1;

import java.util.ArrayList;

public class ShoppingCart {
    static ArrayList<Item> cart = new ArrayList<>();

    public static void addItem(String name, double price, int quantity) {
        Item newItem = new Item(name, price, quantity);
        cart.add(newItem);
    }

    public static void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < cart.size(); i++) {
            if(cart.get(i).name.equals(name)){
                cart.remove(i);
                found = true;
                System.out.println("item : "+ name + "is removed");
                break;
            }
        }
        if(!found){
            System.out.println("item not found in the cart");
        }
    }
    public static void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("No items in the cart");
        }
        else{
            for( Item item : cart){
                System.out.println(item);
            }
        }
    }
    public static void calculateTotal() {
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getTotalPrice();
        }
        System.out.println("Total : " + total);
    }


}

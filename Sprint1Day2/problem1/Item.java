package Sprint1Day2.problem1;
public class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return name + " - " + price + " x " + quantity + " = " + getTotalPrice();
    }
}

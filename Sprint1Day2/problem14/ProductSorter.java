import java.util.*;

class Product {
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}

public class ProductSorter {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Shampoo", "Personal Care", 5.99));
        products.add(new Product("Laptop", "Electronics", 799.99));
        products.add(new Product("Toothpaste", "Personal Care", 2.99));
        products.add(new Product("Phone", "Electronics", 499.99));
        products.add(new Product("T-shirt", "Clothing", 19.99));
        products.add(new Product("Jeans", "Clothing", 39.99));


        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                int categoryComparison = p1.category.compareTo(p2.category);
                
                
                if (categoryComparison == 0) {
                    return Double.compare(p1.price, p2.price);
                }
                
                return categoryComparison;
            }
        });

        
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

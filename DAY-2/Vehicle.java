class Vehicle {
    String brand;
    String model;
 
    Vehicle(String var1, String var2) {
       this.brand = var1;
       this.model = var2;
    }
 
    void display() {
       System.out.println("Brand: " + this.brand);
       System.out.println("Model: " + this.model);
    }
 }
 
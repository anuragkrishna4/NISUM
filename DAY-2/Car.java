class Car extends Vehicle {
    int numberOfDoors;
 
    Car(String var1, String var2, int var3) {
       super(var1, var2);
       this.numberOfDoors = var3;
    }
 
    void displayCarInfo() {
       this.display();
       System.out.println("Number of Doors: " + this.numberOfDoors);
    }
 }
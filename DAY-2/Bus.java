class Bus extends Vehicle {
    int capacity;
 
    Bus(String var1, String var2, int var3) {
       super(var1, var2);
       this.capacity = var3;
    }
 
    void displayBusInfo() {
       this.display();
       System.out.println("Passenger Capacity: " + this.capacity);
    }
 }
class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}


class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        display();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bus extends Vehicle {
    int capacity;

    Bus(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    void displayBusInfo() {
        display();
        System.out.println("Passenger Capacity: " +capacity);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Fortuner", 5);
        Bus bus = new Bus("Volvo", "9400", 50);

        System.out.println("Car Information:");
        car.displayCarInfo();

        System.out.println("\nBus Information:");
        bus.displayBusInfo();
    }
}

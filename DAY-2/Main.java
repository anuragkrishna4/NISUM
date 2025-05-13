
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

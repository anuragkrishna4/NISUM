import java.util.*;
import java.util.stream.*;

class Address {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}

class Employee {
    String firstName, lastName;
    Address address;

    public Employee(String fn, String ln, Address address) {
        this.firstName = fn;
        this.lastName = ln;
        this.address = address;
    }

    public String getFullName() {
        return firstName + lastName;
    }

    public Address getAddress() {
        return address;
    }
}

public class Q18 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Amit", "Sharma", new Address("Delhi", "India")),
            new Employee("Neha", "Verma", new Address("Mumbai", "India")),
            new Employee("Rahul", "Mehra", new Address("Bangalore", "India"))
        );

        Map<String, Address> nameAddressMap = employees.stream()
            .collect(Collectors.toMap(Employee::getFullName, Employee::getAddress));

        nameAddressMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

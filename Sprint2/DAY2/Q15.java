import java.util.*;

class Employee {
    int empId;
    String firstName, lastName;
    Optional<String> address;

    public Employee(int id, String fn, String ln, Optional<String> address) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.address = address;
    }

    public String getAddressOrDefault() {
        return address.orElse("No Address Available");
    }

    @Override
    public String toString() {
        return empId + ": " + firstName + " " + lastName + ", Address: " + getAddressOrDefault();
    }
}

public class Q15 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", Optional.of("Delhi")),
            new Employee(2, "Neha", "Verma", Optional.empty()),
            new Employee(3, "Rahul", "Mehra", Optional.of("Mumbai"))
        );

        employees.stream()
            .forEach(System.out::println);
    }
}

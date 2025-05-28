import java.util.*;
import java.util.Optional;

class Employee {
    int empId;
    String firstName, lastName;
    Optional<String> email;

    public Employee(int id, String fn, String ln, Optional<String> email) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.email = email;
    }

    public String getDetails() {
        return empId + ": " + firstName + " " + lastName + ", Email: " + email.orElse("Not Provided");
    }
}

public class Q14 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", Optional.of("amit.sharma@example.com")),
            new Employee(2, "Neha", "Verma", Optional.empty()),
            new Employee(3, "Rahul", "Mehra", Optional.of("rahul.mehra@example.com"))
        );

        employees.forEach(e -> System.out.println(e.getDetails()));
    }
}

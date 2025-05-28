import java.util.*;
import java.util.stream.*;

class Employee {
    int empId;
    String firstName;
    String lastName;
    String department;
    String email;

    public Employee(int id, String fn, String ln, String dept, String email) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.department = dept;
        this.email = email;
    }

    @Override
    public String toString() {
        return empId + ": " + firstName + " " + lastName + " (" + department + ")";
    }
}

public class Q20{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", "HR", "amit.sharma@example.com"),
            new Employee(2, "Neha", "Verma", "IT", "neha.verma@example.com"),
            new Employee(3, "Rahul", "Mehra", "Finance", null),
            new Employee(4, null, "Singh", "HR", "singh@example.com")
        );

        boolean anyFromHR = employees.stream()
            .anyMatch(e -> "HR".equalsIgnoreCase(e.department));
        System.out.println("Any employee from HR? " + anyFromHR);

        boolean allHaveEmail = employees.stream()
            .allMatch(e -> e.email != null && !e.email.isEmpty());
        System.out.println("All employees have email? " + allHaveEmail);

        boolean noneHasNullName = employees.stream()
            .noneMatch(e -> e.firstName == null || e.lastName == null);
        System.out.println("No employee has null name? " + noneHasNullName);
    }
}

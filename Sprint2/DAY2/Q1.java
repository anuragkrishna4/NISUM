import java.util.*;

class Employee {
    int empId;
    String firstName, lastName, department;

    public Employee(int id, String fn, String ln, String dept) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.department = dept;
    }
}

public class Q1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ram", "Singh", "HR"),
            new Employee(2, "Riya", "Ray", "IT")
        );

        employees.stream()
            .findFirst()
            .ifPresent(e -> System.out.println("Full Name: " + e.firstName + " " + e.lastName));
    }
}

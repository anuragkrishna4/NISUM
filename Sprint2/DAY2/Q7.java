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

    @Override
    public String toString() {
        return empId + ": " + firstName;
    }
}

public class Q7{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", "Doe", "HR"),
            new Employee(5, "Jane", "Smith", "IT"),
            new Employee(3, "Alex", "Brown", "HR")
        );

        employees.stream()
            .max(Comparator.comparingInt(e -> e.empId))
            .ifPresent(System.out::println);
    }
}

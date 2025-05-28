import java.util.*;
import java.util.stream.*;

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

public class Q8 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ram", "Singh", "HR"),
            new Employee(2, "Riya", "Ray", "IT")
        );

        String joined = employees.stream()
            .map(e -> e.firstName + " " + e.lastName)
            .collect(Collectors.joining("|"));

        System.out.println(joined);
    }
}

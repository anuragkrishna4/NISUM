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

    @Override
    public String toString() {
        return firstName + " - " + department;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ram", "Singh", "HR"),
            new Employee(2, "Riya", "Ray", "IT")
        );

        String excludedDept = "HR";
        List<Employee> filtered = employees.stream()
            .filter(e -> !e.department.equalsIgnoreCase(excludedDept))
            .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}

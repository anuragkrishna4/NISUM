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

    public String getDepartment() {
        return department;
    }
}

public class Q2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Anurag", "Kr", "HR"),
            new Employee(2, "Atishay", "Jain", "IT"),
            new Employee(3, "Happy", "Singh", "HR")
        );

        Map<String, Long> deptCount = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(deptCount);
    }
}

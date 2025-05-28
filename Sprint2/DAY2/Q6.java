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
        return firstName + " " + lastName;
    }
}

public class Q6{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(2, "Ram", "Singh", "IT"),
            new Employee(1, "Anurag", "Krishna", "HR")
        );

        employees.stream()
            .sorted(Comparator.comparing(e -> e.firstName))
            .forEach(System.out::println);
    }
}

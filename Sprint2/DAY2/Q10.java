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
        return empId + ": " + firstName + " " + lastName;
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<Employee> allEmployees = Arrays.asList(
            new Employee(1, "Ram", "Singh", "HR"),
            new Employee(2, "Riya", "Ray", "IT"),
            new Employee(3, "Anurag", "Krishna", "HR")
        );

        List<Integer> idsToFind = Arrays.asList(1, 3);

        Set<Integer> idSet = new HashSet<>(idsToFind);

        List<Employee> found = allEmployees.stream()
            .filter(e -> idSet.contains(e.empId))
            .collect(Collectors.toList());

        found.forEach(System.out::println);
    }
}

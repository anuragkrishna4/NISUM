import java.util.*;
import java.util.stream.*;

class Employee {
    int empId;
    String firstName, lastName;
    double salary;

    public Employee(int id, String fn, String ln, double salary) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empId + ": " + firstName + " " + lastName + ", Salary: " + salary;
    }
}

public class Q13{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", 60000),
            new Employee(2, "Neha", "Verma", 55000),
            new Employee(3, "Rahul", "Mehra", 70000),
            new Employee(4, "Priya", "Singh", 50000)
        );

        List<Employee> sortedBySalary = employees.stream()
            .sorted(Comparator.comparingDouble(e -> e.salary))
            .collect(Collectors.toList());

        sortedBySalary.forEach(System.out::println);
    }
}

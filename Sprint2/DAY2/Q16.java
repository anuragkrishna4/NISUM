import java.util.*;
import java.util.Optional;

class Employee {
    int empId;
    String firstName, lastName;
    Optional<String> department;
    double salary;

    public Employee(int id, String fn, String ln, Optional<String> dept, double salary) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.department = dept;
        this.salary = salary;
    }

    public void increaseSalaryIfIT() {
        department.ifPresent(dept -> {
            if (dept.equalsIgnoreCase("IT")) {
                salary += 5000;
            }
        });
    }

    @Override
    public String toString() {
        return empId + ": " + firstName + " " + lastName + ", Dept: " + department.orElse("N/A") + ", Salary: " + salary;
    }
}

public class Q16 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", Optional.of("IT"), 50000),
            new Employee(2, "Neha", "Verma", Optional.of("HR"), 45000),
            new Employee(3, "Rahul", "Mehra", Optional.empty(), 47000),
            new Employee(4, "Priya", "Singh", Optional.of("IT"), 52000)
        );

        employees.stream()
            .forEach(Employee::increaseSalaryIfIT);

        employees.forEach(System.out::println);
    }
}

import java.util.*;
import java.util.stream.*;

class Employee {
    String firstName, lastName;

    public Employee(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Q19 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Amit", "Sharma"),
            new Employee("Neha", "Verma"),
            new Employee("Rahul", "Mehra")
        );

        Optional<Employee> anyEmployee = employees.stream().findAny();
        Optional<Employee> firstEmployee = employees.stream().findFirst();

        anyEmployee.ifPresent(emp -> System.out.println("Any Employee: " + emp));
        firstEmployee.ifPresent(emp -> System.out.println("First Employee: " + emp));
    }
}

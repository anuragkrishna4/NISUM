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

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

public class Q9 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            employees.add(new Employee(i, "First" + i, "Last" + i, "Dept" + (i % 3)));
        }

        employees.stream()
            .skip(7)
            .findFirst()
            .ifPresent(e -> System.out.println("FullName: " + e.getFullName() + ", Dept: " + e.department));
    }
}

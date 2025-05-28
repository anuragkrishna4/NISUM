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

public class Q3 {
    public static void main(String[] args) {
        Map<String, List<Employee>> employeeMap = new HashMap<>();
        employeeMap.put("HR", Arrays.asList(new Employee(1, "John", "Doe", "HR")));
        employeeMap.put("IT", Arrays.asList(new Employee(2, "Jane", "Smith", "IT")));

        String search = "jo";

        List<Employee> result = employeeMap.values().stream()
            .flatMap(List::stream)
            .filter(e -> (e.firstName + e.lastName).toLowerCase().contains(search.toLowerCase()))
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

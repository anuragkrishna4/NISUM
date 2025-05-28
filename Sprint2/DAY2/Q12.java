import java.util.*;
import java.util.stream.*;

class Employee {
    int empId;
    String firstName, lastName, gender;

    public Employee(int id, String fn, String ln, String gender) {
        this.empId = id;
        this.firstName = fn;
        this.lastName = ln;
        this.gender = gender;
    }

    public String getFullName() {
        return firstName + "-" + lastName;
    }

    public String getGender() {
        return gender;
    }
}

public class Q12 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", "MALE"),
            new Employee(2, "Neha", "Verma", "FEMALE"),
            new Employee(3, "Rahul", "Mehra", "MALE"),
            new Employee(4, "Priya", "Singh", "FEMALE"),
            new Employee(5, "Ankit", "Kumar", "MALE")
        );

        Map<String, List<String>> grouped = employees.stream()
            .collect(Collectors.groupingBy(Employee::getGender,
                     Collectors.mapping(Employee::getFullName, Collectors.toList())));

        String result = "MALE: " + grouped.getOrDefault("MALE", new ArrayList<>()) +
                        ", FEMALE: " + grouped.getOrDefault("FEMALE", new ArrayList<>());

        System.out.println(result);
    }
}

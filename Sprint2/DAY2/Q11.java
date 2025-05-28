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

    @Override
    public String toString() {
        return empId + ": " + firstName + " " + lastName + " (" + gender + ")";
    }

    public String getGender() {
        return gender;
    }
}

public class Q11{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "Sharma", "MALE"),
            new Employee(2, "Neha", "Verma", "FEMALE"),
            new Employee(3, "Rahul", "Mehra", "MALE"),
            new Employee(4, "Priya", "Singh", "FEMALE")
        );

        Map<String, Long> genderCount = employees.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(genderCount);
    }
}

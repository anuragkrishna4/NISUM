// using stream print the employee data the format name | lastname

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private Integer id;
    private String name;
    private String lastName;
    private List<Long> phoneNumbers;
    private Integer age;
    private String dep;
    private Double sal;
    
    Employee(Integer id, String name, String lastName, List<Long> phoneNumbers, Integer age,
             String dep, Double sal) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.age = age;
        this.dep = dep;
        this.sal = sal;
    }


   
   

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Integer getAge() {
        return age;
    }

    public String getDep() {
        return dep;
    }

    public Double getSal() {
        return sal;
    }

   public static void main(String[] args) {
    List<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee(1, "Anurag", "Krishna", Arrays.asList(12345987L, 34567455L), 20, "Developer", 123432.21));
    employees.add(new Employee(2, "Happy", "Singh", Arrays.asList(98765432L, 12345678L), 30, "Manager", 150000.00));
    employees.add(new Employee(3, "Amit", "Dey", Arrays.asList(11122233L, 44455566L), 25, "Designer", 80000.00));

    List<String> Result = employees.stream()
        .map(e -> e.getName() + " | " + e.getLastName())
        .collect(Collectors.toList());
    System.out.println(Result);
}
}


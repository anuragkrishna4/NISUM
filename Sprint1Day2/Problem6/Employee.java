import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

   
    @Override
    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Department: " + department +
               ", Salary:" + salary;
    }

    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee(101, "Anurag", "Engineering", 55000));
        employees.add(new Employee(102, "Bhavya", "HR", 45000));
        employees.add(new Employee(103, "Chirag", "Finance", 50000));
        employees.add(new Employee(104, "Divya", "Engineering", 52000));

        
        System.out.println("Sorted Employee Records:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

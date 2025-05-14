package Sprint1Day2.problem2;

public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

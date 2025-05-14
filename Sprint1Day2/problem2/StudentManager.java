package Sprint1Day2.problem2;

import java.util.ArrayList;

public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(int id, String name, double grade) {
        students.add(new Student(id, name, grade));
        System.out.println("Student added successfully.");
    }

    public static void removeStudent(int id) {
        boolean removed = false;
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student with ID " + id + " removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public static void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nAll Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

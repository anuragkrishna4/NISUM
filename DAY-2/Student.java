class Student {
    String name;
    String address;
    String section;
    String className;
    int studentRollNo;
    
    static String college="Kalinga Institute of Technology";
    static int rollNo = 100; 

    Student(String name, String address, String section, String className) {
        this.name = name;
        this.address = address;
        this.section = section;
        this.className = className;
        this.studentRollNo = ++rollNo;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Section: " + section);
        System.out.println("Class: " + className);
        System.out.println("College: " + college);
        System.out.println("Roll No: " + studentRollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anurag", "Patna", "A", "CSE-3A");
        Student s2 = new Student("Krishna", "Delhi", "B", "CSE-3B");

        s1.displayInfo();
        s2.displayInfo();
    }
}

class Marks {
    String name;
    String college;

    
    private int subject1;
    private int subject2;
    private int subject3;

    Marks(String name, String college, int subject1, int subject2, int subject3) {
        this.name = name;
        this.college = college;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
    }
}

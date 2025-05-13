import java.util.*;

class Profile{
    String name;
    int age;
    String phone;
    String email;
    String address;

    Profile(String name, int age, String phone, String email, String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    void display(){
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter phone number:");
        String phone = sc.nextLine();
        System.out.print("Enter email:");
        String email = sc.nextLine();
        System.out.print("Enter address:");
        String address = sc.nextLine();

        Profile userProfile = new Profile(name, age, phone, email, address);
        userProfile.display();
    }

}
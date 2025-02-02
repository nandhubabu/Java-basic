import java.util.Scanner;

class Employee {
    String name;
    int age;
    String address;
    String phoneNumber;
    float salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine();  // consume newline left-over
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter phone number:");
        phoneNumber = sc.nextLine();
        sc.close();
    }

    void setSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        salary = sc.nextFloat();
        sc.close();
    }

    float computeSalary() {
        return salary;
    }
}

class Officer extends Employee {
    String specialisation;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter specialisation:");
        specialisation = sc.nextLine();
        sc.close();
    }
}

class Manager extends Employee {
    String department;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department:");
        department = sc.nextLine();
        sc.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Officer officer = new Officer();
        officer.input();
        officer.setSalary();
        System.out.println("Officer's Salary: " + officer.computeSalary());

        Manager manager = new Manager();
        manager.input();
        manager.setSalary();
        System.out.println("Manager's Salary: " + manager.computeSalary());
    }
}

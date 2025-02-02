import java.util.*;

 class Person {
    String name;
    int age;
    String address;
    long phoneNumber;
    double salary;

    public Person(String name, int age, String address, long phoneNumber, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary is " + salary);
    }
}

class Officer extends Person {
    String specialization;

    public Officer(String name, int age, String address, long phoneNumber, double salary, String specialization) {
        super(name, age, address, phoneNumber, salary);
        this.specialization = specialization;

        System.out.println("\nOFFICER DETAILS");
        System.out.println("\nName = " + name + "\nAge = " + age + "\nAddress = " + address + "\nPhone Number = " + phoneNumber + "\nSalary = " + salary + "\nSpecialization = " + specialization);
        super.printSalary();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OFFICER DETAILS");

        System.out.println("\nEnter the name:");
        String name = scanner.nextLine();

        System.out.println("\nEnter the age:");
        int age = scanner.nextInt();

        scanner.nextLine(); // consume newline left-over
        System.out.println("\nEnter the address:");
        String address = scanner.nextLine();

        System.out.println("\nEnter the phone number:");
        long phoneNumber = scanner.nextLong();

        System.out.println("\nEnter the salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline left-ove

        System.out.println("\nEnter the specialization:");
        String specialization = scanner.nextLine();

        scanner.close();

        Officer officer = new Officer(name, age, address, phoneNumber, salary, specialization);
    }
}

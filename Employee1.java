import java.util.*;
class Employee {
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;

    public Employee(String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void Display()
    {
	System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("PhoneNumber"+phoneNumber);
	System.out.println("Address"+address);
    }
    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}
class Officer extends Employee {
    private String specialization;

    public Officer(String name, int age, long phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    public void OfficerDisplay()
    {
       Display();
       printSalary();
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, int age, long phoneNumber,
                    String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}
public class Employee1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Officer Details");
		System.out.println("Enter the Employee Name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the phonenumber");
		long ph=sc.nextLong();
		System.out.println("Enter the Address");
		String address=sc.next();
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		System.out.println("Enter the Specialization");
		String sp=sc.next();
		Officer of=new Officer(name,age,ph,address,salary,sp);
                of.OfficerDisplay();
		System.out.println("Enter the Manager Details");
		System.out.println("Enter the Employee Name");
		String name1=sc.next();
		System.out.println("Enter the age");
		int age1=sc.nextInt();
		System.out.println("Enter the phonenumber");
		long ph1=sc.nextLong();
		System.out.println("Enter the Address");
		String address1=sc.next();
		System.out.println("Enter the Salary");
		double salary1=sc.nextDouble();
		System.out.println("Enter the Department");
		String dp=sc.next();
		Manager mg=new Manager(name1,age1,ph1,address1,salary1,dp);
	}
}
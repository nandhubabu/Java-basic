class Student{
	String firstName;
	String lastName;
	int age;
	double gpa;
	String major;
	public Student()
	{
		firstName = "Jim";
		lastName = "Halpert";
		age = 24;
		gpa = 8.8;
	}
}
public class DefaultConstructors
{
	public static void main(String args[])
	{
		Student S1= new Student();
		System.out.println(S1.firstName);
	}
}
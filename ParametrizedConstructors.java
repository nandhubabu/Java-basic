class Student{
	String firstName;
	String lastName;
	int age;
	double gpa;
	String major;
	public Student(String firstName,String lastName,int age,double gpa,String major)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
	}
}
public class ParametrizedConstructors
{
	public static void main(String args[])
	{
		Student S1= new Student( "Jim","Halpert",24,8.8,"CS");
		Student S2= new Student( "Adarsh","Mathew",24,7.8,"ECE");
		System.out.println(S1.firstName+" "+S1.lastName);
		System.out.println(S2.firstName+" "+S2.lastName);
	}
}
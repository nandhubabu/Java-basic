class Student
{
	String firstName;
	String lastName;
	int age;
	double gpa;
	String major;
	boolean onProbation;
}
public class ClassFile
{
	public static void main(String args[])
	{
		Student myStudent = new Student();
		myStudent.firstName = "Jim";
		myStudent.lastName = "Halpert";
		myStudent.age = 24;
		myStudent.gpa = 8.8;
		myStudent.onProbation = false;
		System.out.println(myStudent.firstName);

		Student myStudent2 = new Student();
		myStudent2.firstName = "Adarsh";
		myStudent2.lastName = "Mathew";
		myStudent2.age = 25;
		myStudent2.gpa = 8.9;
		myStudent2.onProbation = true;
		System.out.println(myStudent2.firstName);
	}
}
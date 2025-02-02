// Java Program Illustrating Dividion of Classes into
// Packages where Class StudentDataExtended creates
// Second package- pack2 and uses the first package

// Importing packages
package pack2;
// Importing required classes
// from pre-defined packages
import java.io.*;
import java.lang.*;
import java.util.*;
import pack1.*;

// Main class
class StudentDataExtended extends StudentData {

	private String location;
	public void addDetails(String id, String name,
						String location)
	{
		addStudentData(id, name);

		// This keyword refers to current object itself
		this.location = location;
	}

	// Method 1
	public static void
	printDetails(TreeMap<String, StudentDataExtended> map)
	{

		// Iterating via for each loop
		for (String a : map.keySet()) {

			StudentDataExtended student = map.get(a);

			// Print ID and name of student
			System.out.println(student.getId() + " "
							+ student.getName() + " "
							+ student.location);
		}
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Display a message for asking input from the user
		System.out.print("Enter the number of students : ");

		// Scanner class to read user input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String buffer = sc.nextLine();

		int count = 1;
		// Creating a TreeMap
		TreeMap<String, StudentDataExtended> map
			= new TreeMap<>();

		while (n != 0) {

			System.out.println(
				"Enter the details of Student " + count
				+ " (id, name, location):");

			count++;

			String details = sc.nextLine();
			String studentInfo[] = details.split(" ");

			StudentDataExtended student
				= new StudentDataExtended();

			student.addDetails(studentInfo[0],
							studentInfo[1],
							studentInfo[2]);
			map.put(studentInfo[0], student);
			n--;
		}

		// Display message
		System.out.println("\nThe Student Details are:");

		// Calling above method 1 to
		// print details of the students
		printDetails(map);
	}
}

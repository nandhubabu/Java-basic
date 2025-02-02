// Java Program Illustrating Dividion of Classes into
// Packages where Class StudentData
// which creates first package i.e pack1

// Importing package
package pack1;

// Main class
public class StudentData {

	private String id;
	private String name;

	// Method 1
	public void addStudentData(String id, String name)
	{
		// This keyword refers to current instance itself
		this.id = id;
		this.name = name;
	}

	// Getter setters Methods

	// Use getter methods so that we can
	// access private members for other packages
	public String getId() { return id; }
	public String getName() { return name; }
}

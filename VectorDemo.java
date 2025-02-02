import java.util.Vector;
public class VectorDemo
{
	public static void main(String args[])
	{
	 	Vector<String> mammals = new Vector<>();
		mammals.add("Dog");
		mammals.add("Cow");
		mammals.add(0,"Camel");
		System.out.println("Mammals="+mammals);
	}
}
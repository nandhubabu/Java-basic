class Box
{
	double height;
	double width;
	double length;
}
public class ObjectReferences
{
	public static void main(String args[])
	{
		Box b1=new Box();
		Box b2= b1;
		b2.height=4;
		b2.width=5;
		b2.length=7;
		System.out.println(b1.height+" "+b1.width+" "+b1.length);
	}
}
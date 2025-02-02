class MethodOverLoading
{
	void area(float x)
	{
		System.out.println("the area of circle is"+ (3.14*x*x));
	}
	void area(int x,int y)
	{
		System.out.println("the area of circle is"+(x*y));
	}
	void area(float x,float y)
	{
		System.out.println("the area of circle is"+(0.5*x*y));
	}
}
public class Shapes
{
	public static void main(String args[])
	{
		MethodOverLoading md1= new MethodOverLoading();
		md1.area(5);
		md1.area(11,12);
		md1.area(3,4);
	}
}
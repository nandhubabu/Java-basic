import java.util.*;
class Circle extends Shape
{
	public void area(int radius)
	{
		area = 3.14*radius*radius;
		System.out.println("Area of circle is\t" +area);
	}
}
class Rectangle extends Shape
{
	public void area(int length,int breadth)
	{
		area = length*breadth;
		System.out.println("Area of rectangle is\t" +area);
	}
}
abstract class Shape
{
	abstract void area();
}
public class Shape2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius=sc.nextInt();
		Shape c1=new Circle();
		c1.area(radius);
		System.out.println("Enter the length of Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		int breadth=sc.nextInt();
		Shape r1=new Rectangle();
		r1.area(length,breadth);
	}
}


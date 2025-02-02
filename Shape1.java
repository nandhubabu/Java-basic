import java.util.*;
class Circle extends Shape
{
	int radius;
	double area;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public void area()
	{
		area = 3.14*radius*radius;
		System.out.println("Area of circle is\t" +area);
	}
}
class Rectangle extends Shape
{
	int length,breadth;
	double area;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		area = length*breadth;
		System.out.println("Area of rectangle is\t" +area);
	}
}
abstract class Shape
{
	abstract void area();
}
public class Shape1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius=sc.nextInt();
		Shape c1=new Circle(radius);
		c1.area();
		System.out.println("Enter the length of Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		int breadth=sc.nextInt();
		Shape r1=new Rectangle(length,breadth);
		r1.area();
	}
}



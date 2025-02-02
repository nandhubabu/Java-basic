class Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b, int c)
	{
		return a+b+c;
	}
	public double add(double a,int b)
	{
		return a+b;
	}
}
public class MethodOverloading
{
	public static void main(String args[])
	{
		Calculator c1= new Calculator();
		int result = c1.add(3,4);
		int result1 = c1.add(3,4,3);
		System.out.println(result);
		System.out.println(result1);
	}
}
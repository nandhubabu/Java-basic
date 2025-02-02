import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc1.nextInt();
		System.out.println("Enter the second number");
		int b=sc1.nextInt();
		System.out.println("enter the third number");
		int c=sc1.nextInt();
		if (a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
	}
}
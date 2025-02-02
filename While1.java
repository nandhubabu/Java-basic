import java.util.Scanner;
class While1
{
	public static void main(String args[])
	{
                int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n!=0)
		{
			int re=n%10;
			rev=rev*10+re;
			n=n/10;
		}
		System.out.println("Reverse the number is "+rev);
	}
}
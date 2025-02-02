import java.util.Scanner;
class Sumn
{
	public static void main(String args[])
	{
                int sum=0,i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
	        System.out.println("Sum="+sum);
	}
}
		
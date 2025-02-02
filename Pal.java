import java.util.*;
public class Pal
{
	public static void main(String args[])

	{
		Scanner obj=new Scanner(System.in);
		String A;
		int i;
		String B="";
		System.out.println("enter the string");
		A = obj.nextLine();
		int x =A.length();
		System.out.println(x);
		for(i=x-1;i>=0;i--)
		{
 			B=B+A.charAt(i);
		}
		if(A.equalsIgnoreCase(B))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
	}
}

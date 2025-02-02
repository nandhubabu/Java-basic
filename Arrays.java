import java.util.*;
public class Arrays
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
                int size = sc.nextInt();
		sc.skip(System.lineSeparator());
		String[] cars=new String[size];
		System.out.println("Enter the cars name");
		for(int i=0;i<size;i++)
		{
                      cars[i]=sc.nextLine();
		}
                for(int i=0;i<size;i++)
		{
			System.out.println("Cars="+cars[i]);
		}
	}
}

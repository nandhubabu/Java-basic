import java.io.*;
import java.util.*;
public class File2
{
	public static void main(String args[]) throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("myfile.txt");  
		Scanner in=new Scanner(fis); 
                while(in.hasNext())
		{
			System.out.println(in.nextLine());
		}
	}
}
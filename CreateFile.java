import java.io.*;
public class CreateFile
{
	public static void main(String args[])
	{
		try
		{
			File myObj = new File("filename.txt");
			if(myObj.createNewFile())
			{
				System.out.println("File created"+myObj.getName());
			}
			else
			{
				System.out.println("File Already exists");
			}
		}
			catch(IOException e)
			{
				System.out.println("An error occured");
				e.printStackTrace();
			}
	}
}
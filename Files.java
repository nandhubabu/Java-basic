import java.io.*;
class Files {
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fr = new FileInputStream("gfgInput.txt");
			FileOutputStream fw = new FileOutputStream("gfgOutput.txt");
			//String str = "";
			int i;
			while ((i = fr.read()) != -1) 
			{
				System.out.println((char)i);
				fw.write((char)i);
			}
			fr.close();
			fw.close();
			System.out.println("File reading and writing both done");
		}
		catch (IOException e) 
		{
			System.out.println("There are some IOException");
		}
	}
}

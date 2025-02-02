import java.io.*;
public class File1
{
	public static void main(String args[]) throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter(System.out);
                pw.writ e("Hai Hello How are you");
		pw.write("Where are you");
		pw.close();
	}
}
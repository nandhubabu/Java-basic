import java.io.*;
public class ShowFile 
	{
		public static void main(String args[]) 
		{
			try 
			{
        			FileInputStream input = new FileInputStream("myfile.txt");
				FileOutputStream fos= new FileOutputStream("myfile.txt");
				System.out.println("Data in the file: ");
        			// Reads the first byte
        			int i = input.read();
				while(i != -1) {
                                        fos
           				System.out.print((char)i);
                                        // Reads next byte from the file
                                        i = input.read();
        			}
        			input.close();
     			}
			catch(Exception e) 
			{
        			e.getStackTrace();
    			 }
  }
} 
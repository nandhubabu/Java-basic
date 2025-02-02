import java.io.*;
class Emp implements Serializable
{
	int empno=101;
	float salary = 50000.00f;
}
class SampleSerialization
{
	public static void main(String args[])
	{
		try
		{
			Emp e1=new Emp();
			FileOutputStream fos= new FileOutputStream("emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.close();
			fos.close();
			FileInputStream fis= new FileInputStream("emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Emp e2=(Emp)ois.readObject();
			ois.close();
			fis.close();
		}
		catch(Exception e)
               	{
			System.err.println(e);
		}
	}
}
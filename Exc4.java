class Exc4
{
	public static void main(String args[])
	{
		int i=0;
		int j=0;
		String str=null;
		int []a= new int[5];
		try
		{
			j=18/i;
			System.out.println(str.length());
			System.out.println(a[1]);
			System.out.println(a[5]);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero\t"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in your limit\t"+e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong\t"+e);
		}
  		System.out.println("j="+j);
		System.out.println("Bye");	
	}
}
class Exc3
{
	public static void main(String args[])
	{
		int i=0;
		int j=0;
		try
		{
			j=18/i;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went Wrong\t");
		}
  		System.out.println("j="+j);
		System.out.println("Bye");	
	}
}
class ThrowExample
{
	public static void main(String args[])
	{
		int i=0;
		int j=0;
		try
		{
			j=18/i;	
			if(j==0)
			{
				throw new ArithmeticException("HAi");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero\t"+e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong\t"+e);
		}
  		System.out.println("j="+j);
		System.out.println("Bye");	
	}
}
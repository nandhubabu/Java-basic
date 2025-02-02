class NestTry
{
	public static void main(String args[])
	{
		try
		{
			int a=0;
			System.out.println("a="+a);
			try
			{
				a=a/(a-a);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception Inside nested try"+e);
			}
		}
		catch(Exception e)
		{
			System.out.println("Divide by 0:"+e);
		}
	}
}	
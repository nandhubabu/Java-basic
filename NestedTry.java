class NestedTry
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a[] ={10,20,30};
				System.out.println(a[5]);
			}	
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index is Out of bounded");
			}
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
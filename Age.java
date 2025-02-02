class Age
{
	public static void age1(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Welcome for  voting");
		}
	}	
	public static void main(String args[])
	{
             	try
		{
			for(String str: args) {
   				int age2 = Integer.parseInt(str);
				age1(age2);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not Valid for voting");
		}
	}
}
		
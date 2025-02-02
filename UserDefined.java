class UserDefined
{
	public static void main(String args[])
	{
		try
		{
	        	if(Integer.parseInt(args<18))
			{ 
	            		throw new AgeDoesNotFitException("InvalidAgeException");
	        	}
	   	 }
	         catch(AgeDoesNotFitException ex) 
		 {
	         	System.out.println(ex);
	    	 }
	}
}
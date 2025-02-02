public class StringMethods
{
	public static void main(String args[])
	{
		String name= "Bro";
		boolean result= name.equals("bro");
		System.out.println("Result="+result);
		boolean result1 = name.equalsIgnoreCase("bro");
		System.out.println("Result1="+result1);
		int result2 = name.length();
		System.out.println("Result2="+result2);
		char result3 = name.charAt(0);
		System.out.println("Result3="+result3);
		int result4 = name.indexOf('o');
		System.out.println("Result4="+result4);
		boolean result5 = name.isEmpty();
		System.out.println("Result5="+result5);
		String result6 = name.toUpperCase();
		System.out.println("Result6="+result6);
		String result7 = name.toLowerCase();
		System.out.println("Result7="+result7);
		String result8 = name.trim();
                System.out.println("Result8="+result8);
		String result9 = name.replace('B','S');
		System.out.println("Result9="+result9);
	}
}
		
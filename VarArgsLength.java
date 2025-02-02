class Sum1
{
        int sum=0;
	int add(int ...n)
	{
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}	
}
class VarArgsLength
{
	public static void main(String args[])
	{
		Sum1 s= new Sum1();
		System.out.println(s.add(1,2,3,4,5,6,7,8,9,10));
	}	
}
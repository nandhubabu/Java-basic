class A extends Thread
{
	public void run()
	{ 
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class Bclass
{
	public static void main(String args[])
	{
		A t=new A();
		t.setPriority(4);
		System.out.println(t.getPriority());
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Parent Thread");
		}
	}
}
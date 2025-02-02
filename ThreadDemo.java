class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Demo thread");
		System.out.println("Child thread"+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("Child Thread"+i);
			}
			Thread.sleep(5000);	
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread interrupted");
		}
		System.out.println("Exit Child Thread");
	}
}
public class ThreadDemo
{
	public static void main(String args[])
	{
		new NewThread();
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("Main Thread"+i);
			}
			Thread.sleep(1000);	
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Exit Main Thread");
	}
}

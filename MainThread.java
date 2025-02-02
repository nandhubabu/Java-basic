class MyThreadClass extends Thread
{
	public void run()
	{
		System.out.println("My child thread");
	}
}
public class MainThread
{
	public static void main(String args[])
	{
		//Thread.currentThread().setName("Main Thread");
		//System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setPriority(10);
		//System.out.println(Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().isAlive());
		MyThreadClass t= new MyThreadClass();
		t.start();
		System.out.println(t.isAlive());
		System.out.println("Active thread"+Thread.activeCount());
		
		try
		{
			System.out.println("Active thread"+Thread.activeCount());
			for(int i=3;i>0;i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
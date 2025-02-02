class CountDown extends Thread
{
	public void run()
	{
                try
		{
			for(int i=10;i>0;i--)
			{
				System.out.println("#Thread1\t"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Methods");
		}
		System.out.println("#Thread1 is sucessfully completed");
	}
}
class CountUp extends Thread
{
	public void run()
	{
		 try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("#Thread2\t"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Methods");
		}
		System.out.println("#Thread2 is sucessfully completed");
	}
}
public class MyThread1
{
	public static void main(String args[])
	{
                try
		{
			CountDown cd=new CountDown();
			cd.start();
			cd.join();
			CountUp cp=new CountUp();
			cp.start();
			cp.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Methods");
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Main Thread"+i);
		}
	}
}
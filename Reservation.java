class Train implements Runnable
{
	int avail=1,passenger;
	Train(int passenger)
	{
		this.passenger=passenger;
	}
	public synchronized void run()
	{
		String name=Thread.currentThread().getName();
		if(avail>=passenger)
		{
			System.out.println("For "+name+" Seat is available");
			avail=avail-passenger;
		}
		else
		{
			System.out.println("For "+name+" Seat is not available");
		}	
	}
}
public class Reservation
{
	public static void main(String args[])
	{
		Train t=new Train(1);
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.setName("Ram");
		t2.setName("Syam");
		t3.setName("Ryan");
		t1.start();
		t2.start();
		t3.start();
	}
}
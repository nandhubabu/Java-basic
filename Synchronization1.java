public class Synchronization1 implements Runnable
{
    int tickets = 3;
    static int i = 1, j = 2, k = 3;
    synchronized void bookticket (String name, int wantedtickets)
    {
        if (wantedtickets <= tickets)
        {
            System.out.println (wantedtickets + " booked to " + name);
            tickets = tickets - wantedtickets;
        }
        else
        {
            System.out.println ("No tickets to book");
        }
    }
    public void run ()
    {
        String name = Thread.currentThread ().getName ();
        if (name.equals ("t1"))
        {
            bookticket (name, i);
        }
        else if (name.equals ("t2"))
        {
            bookticket (name, j);
        }
        else
        {
            bookticket (name, k);
        }
    }

    public static void main (String[]args)
    {
        Synchronization s = new Synchronization ();
        Thread t1 = new Thread (s);
        Thread t2 = new Thread (s);
        Thread t3 = new Thread (s);
        t1.setName ("t1");
        t2.setName ("t2");
        t3.setName ("t3");
        t1.start ();
        t2.start ();
        t3.start ();
    }
}
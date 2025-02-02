import java.util.*;
public class DLL
{
	static LinkedList<Integer> l=new LinkedList<Integer>();
	static void Insertion()
			{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the size of the Doubly Linked List:");
					int n=sc.nextInt();
					System.out.println("Enter the elements of the Doubly Linked List:");
					for(int i=0;i<n;i++)
					{
						System.out.println("Enter["+i+"]");
						int a=sc.nextInt();
						l.add(a);
					}
			}
					
	  static void Display()
				{	
					Iterator it=l.iterator();
					if(l.isEmpty())
					{
						System.out.println("List is Empty");
						
					}
					else
					{
						System.out.print("The Doubly Linked List Elements are:\n");
						while(it.hasNext())
						{
							System.out.println(it.next());
						}
					}
				}

	  static void Deletion_Front()
			{
					try
					{
						int b;
						b=l.removeFirst();
						System.out.println("Deleted Element is  "+b);	
					}
					catch(NoSuchElementException e)
					{
						System.out.println("No Element for Deletion");
			
					}
			}

	static void Deletion_Last()
			{
					try
					{
						int b;
						b=l.removeLast();
						System.out.println("Deleted Element is  "+b);	
					}
					catch(NoSuchElementException e)
					{
						System.out.println("No Element for Deletion");
			
					}
			}

	static void Deletion_Position(int x)
			{
					try
					{
						int b;
						b=l.remove(x-1);
						System.out.println("Deleted Element from the position  is  "+b);	
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("No Element for Deletion");
			
					}
			}



	public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int c;
			
				
				do
				{
				System.out.println("****Doubly Linked List Operations******\n");
			System.out.print("\n 1.Insertion\n 2.Deletion at Front\n 3.Deletion at End\n 4.Deletion at Position\n 5.Display\n 6.Exit\n");
				System.out.print("Enter your choice:");
				c=sc.nextInt();
				switch(c)
					{
						case 1:
							Insertion();
							break;
						case 2:
							Deletion_Front();
							break;
						case 3:
							Deletion_Last();
							break;
						case 4:
							System.out.println("Enter the element to be deleted:");
							int y=sc.nextInt();
							Deletion_Position(y);
							break;
						case 5:
							Display();
							break;
						case 6:
							System.out.println("Exiting the Program");
							break;
						
						default:
							System.out.println("Enter valid choices:");
							break;
					}
			}while(c!=6);
			
		}
}
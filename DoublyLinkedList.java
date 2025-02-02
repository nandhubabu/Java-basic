import java.util.*;
public class DoublyLinkedList {
    public static void main(String[] args) {
        int i,ch,element,position;
        LinkedList<Integer> dblList = new LinkedList<Integer>();
        Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements in the list");
	int n=sc.nextInt();
	System.out.println("Enter the elements in the list");
	for(i=0;i<n;i++)
	{
		int x=sc.nextInt();
		dblList.add(x);
	}
        System.out.println("1.Delete a given element");
        System.out.println("2.Display elements in the list");
        System.out.println("3.Exit");
        do {
            System.out.print("Choose your choice(1 - 3) :");
            ch=sc.nextInt();
            switch(ch) {
                case 1:    // To read element form the user to remove
                        System.out.print("Enter element to remove : ");
                        Integer ele_rm;
                        ele_rm=sc.nextInt();
                        if (dblList.contains(ele_rm)){
                            dblList.remove(ele_rm);
                            System.out.println("Successfully Deleted");
                            Iterator itr=dblList.iterator(); 
                            System.out.println("Elements after deleting :"+ele_rm);
                            while(itr.hasNext()) {  
                                System.out.print(itr.next()+"<->"); 
                            }
                            System.out.println("NULL"); 
                        }
                        else {
                            System.out.println("Element not found");
                        }
                        break;
        
                case 2:    // To Display elements in the list
                        Iterator itr=dblList.iterator(); 
                        System.out.println("Elements in the list :");
                        while(itr.hasNext()) {  
                            System.out.print(itr.next()+"<->"); 
                        }
                        System.out.println("NULL");
                        break;

                case 3:    System.out.println("Program terminated");
                        break;
                default:System.out.println("Invalid choice");
            }
        }
        while(ch!=6);
    }
}

 import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Java
 */
public class DLL {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    LinkedList<Integer>a=new LinkedList<>();

    System.out.println("Enter the no. of Elements");
    int n=sc.nextInt();

    System.out.println("ENTER THE LIST ELEMENT : \n");
    for(int i=0;i<n;i++)
    {
        int x=sc.nextInt();
        a.add(x);
    }
    System.out.println("...List...");
    Iterator<Integer>itr=a.iterator();

    while (itr.hasNext()) {
        int element=itr.next();
        System.out.println(""+element+"");
    }
    int ch=-1;
    do
    {
        System.out.println("");
        System.out.println("1.DELETE FROM FRONT");
        System.out.println("2.DELETE FROM END");
        System.out.println("3.DELETE FROM POSITION");
        System.out.println("4.DISPLAY CURRENT LIST");
        System.out.println("0.EXIT\n");

        System.out.println("ENTER THE CHOISE");
        ch=sc.nextInt();
        switch (ch) 
        {
            case 1:a.removeFirst();
                 
                break;
            case 2:a.removeLast();
                break;
            case 3:System.out.println("enter the position");
                    int pos=sc.nextInt();
                    if(pos<=n)
                    {
                        a.remove(pos-1);
                    }
                    else
                    {
                        System.out.println("Invalid!");
                    }
            case 4:System.out.println(""+a+"");
            case 0:break;
            default:System.out.println("Enter a valid choise");
                break;
        }
    }while(ch!=0);
    sc.close();
}
} 
    


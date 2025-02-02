import java.util.*;

/**
 * Frequncy_Occurence
 */
public class Frequncy_Occurence {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        int len=str.length();
        System.out.println("Enter the charector :");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(ch==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequncy count of "+ch+" is :"+count);
        sc.close();
      }  
}
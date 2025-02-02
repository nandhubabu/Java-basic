import java.util.*;

public class Frequncy_of_Charector{
public static void main(String []args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the String");
    String str=obj.nextLine();
    System.out.print("Charectors is "+str);
    int len=str.length();
    System.out.print("\nEnter the charector :");
    char c= obj.next().charAt(0);
    obj.close();
    int count=0;
    for(int i=0;i<len;i++)
    {
        if(str.charAt(i)==c)
        {
            count++;
        }
    }
    System.out.print("The occurence of charector is "+count);
}
}
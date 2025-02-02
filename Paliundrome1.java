 import java.util.*;
 //import java.io.*;

 class Paliundrome1{
    public static void main(String[] args) {
        int i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name=sc.nextLine();
        int len=name.length();
        String str= name.toLowerCase();
        sc.close();
        for(i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=(str.charAt(len-i-1)))
            {
                flag=-1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("It is paliundrome");
        }
        else
        {
            System.out.println("It is not Paliundrome");
        }
        
    }
 }
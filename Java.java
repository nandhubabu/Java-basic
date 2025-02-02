import java.util.*;

/**
 * Java
 */
public class Java 
{
        public static void main(String[] args) 
        {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no.of elements");
            int n=sc.nextInt();
            String a[]=new String[n];

            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.next();
            }
            Java obj=new Java();
            obj.sort(a,0,n-1);
            System.out.println("Sorted array is ");
            PrintArray(a);
            sc.close();
        }

     public void sort(String a[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(a, low, high);
            sort(a, low, pi-1);
            sort(a, pi+1, high);
        }
    }

    public int partition(String a[],int low,int high)
    {
        String pivot=a[high];
        int i=low-1;
        for (int j = low; j < high; j++) {
            if(a[j].compareTo(pivot) <=0)
            {
                i++;
                String temp=a[j];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        String temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return(i+1);
    }
   
    static void PrintArray(String a[])
    {
        int I=a.length;
        for(int i=0;i<I;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }    
}
import java.util.*;
public class Main
{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String arr[]=new String[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.next();
    }
   // System.out.println(Arrays.toString(arr));
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)                               
        {
            int k=j+1;
            if(arr[k].compareTo(arr[j])<0)
            {
                String temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
        }
    }
      System.out.println(Arrays.toString(arr));
}
}
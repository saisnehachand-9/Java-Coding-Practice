import java.util.*;
public class Main
{
    public static int check(int arr[],int k)
    {
         for(int i=arr.length-1;i>=0;i--)
	    {
	       if(arr[i]==k)
	          return i;
	    }
	    return -1;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	     int k=s.nextInt();
	     	System.out.println(check(arr,k));
	}
}

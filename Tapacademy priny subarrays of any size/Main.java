import java.util.*;
public class Main
{
    public static void printSubarrays(int arr[],int n,int k)
    {
        for(int i=0;i<=n-k;i++)
	  {
	      for(int j=i;j<i+k;j++)
	      {
	           System.out.print(arr[j]+" ");
	      }
	       System.out.println();
	  } 
	   
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int size=s.nextInt();
	    printSubarrays(arr,n,size);
	  
	}
}

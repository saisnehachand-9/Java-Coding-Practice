import java.util.*;
public class Main
{
    public static void printSubarrays(int arr[],int n,int k)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++)
	  {
	       int sum=0;
	      for(int j=i;j<i+k;j++)
	      {
	          sum=sum+arr[j];
	      }
	     if(sum>max)
	       max=sum;
	  } 
	    System.out.print(max);
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

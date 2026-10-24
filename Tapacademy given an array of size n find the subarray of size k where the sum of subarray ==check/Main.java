import java.util.*;
public class Main
{
    public static void printSubarrays(int arr[],int n,int k,int check)
    {
       int newarr[]=new int[k];
       int l=0;
        for(int i=0;i<=n-k;i++)
	  {
	       int sum=0;
	      for(int j=i;j<i+k;j++)
	      {
	          sum=sum+arr[j];
	          newarr[l++]=arr[j];
	      }
	     if(check==sum){
	      for(int m=0;m<newarr.length;m++)
	      {
	          System.out.print(newarr[m]+" ");
	      }
	     }
	     l=0;
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
	    int k=s.nextInt();
	    int check=s.nextInt();
	    printSubarrays(arr,n,k,check);
	  
	}
}

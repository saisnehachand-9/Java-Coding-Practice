import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	  for(int i=0;i<n;i++)
	  {
	      if((i+3)<=n){
	      for(int j=i;j<i+3;j++)
	      {
	           System.out.print(arr[j]+" ");
	      }
	      }
	       System.out.println();
	  } 
	  
	  //or
	  System.out.println("WE Can ALSO ACHEVE IN THIS WAY!!!!");
	  for(int i=0;i<=n-3;i++)
	  {
	      for(int j=i;j<i+3;j++)
	      {
	           System.out.print(arr[j]+" ");
	      }
	       System.out.println();
	  } 
	   
	}
}

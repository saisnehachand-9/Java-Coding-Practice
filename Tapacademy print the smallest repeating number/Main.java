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
	   int min=Integer.MAX_VALUE; // 1 1 
	   int c=1;//2
	   int c1=0;
	    for(int i=0;i<n-1;i++)
	    {
	        
	      if(arr[i]==arr[i+1])
	        {
	           c++;
	           if(arr[i]<min)
	              min=arr[i];
	        }
	    }
	    
	  	System.out.println(min);
	 
	}
}


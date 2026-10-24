import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   int c=1;
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	   
	    for(int i=0;i<n-1;i++)
	    {
	      if(arr[i]==arr[i+1])
	        {
	           c++;
	        }
	       else{
	           	System.out.println(arr[i]+" "+c);
	           	c=1;
	       }
	    }
	  	System.out.println(arr[n-1]+" "+c);
	 
	}
}


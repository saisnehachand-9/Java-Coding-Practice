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
	   int max=arr[0]; // 1 1 
	   int c=1;//2
	   int c1=0;
	    for(int i=0;i<n-1;i++)
	    {
	        
	      if(arr[i]==arr[i+1])
	        {
	           c++;
	        }
	       else{
	        if(c>c1)
	        {
	            max=arr[i];
	            c1=c;
	        }
	           	c=1;
	       }
	    }
	    if(c>c1)
	    {
	         max=arr[n-1];
	            c1=c;
	    }
	  	System.out.println(max+" "+c1);
	 
	}
}


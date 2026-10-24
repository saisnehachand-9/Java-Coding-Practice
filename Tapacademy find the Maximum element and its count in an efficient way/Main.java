import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   int max=0;
	   int c=0;
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	   
	    for(int i=0;i<arr.length;i++)
	    {
	      if(arr[i]>max)
	        {
	            max=arr[i];
	            c=1;
	        }
	       else{
	           if(arr[i]==max)
	           c++;
	       }
	    }
	  
	 	System.out.println("Max : "+max+" Count : "+c);
	}
}

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
	    int max1=arr[0]; //6  8  9  23  
	    int max2=arr[0]; //6  6  8   9
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>max1)
	        {
	            max2=max1;
	            max1=arr[i];
	        }
	        else if(arr[i]>max2)
	        {
	            max2=arr[i];
	        }
	    }
	    
	    
		System.out.println("max1: "+max1+" "+" max2 : "+max2);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);       // 7 3 2 4 9 5
	    int n=s.nextInt();                    //o/p  // 7*3$2#4$9*5
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    
	    for(int i=0;i<n;i++) //1 2 3 4 5 6 7 
	    {
	             System.out.print(arr[i]);
	        	if(i!=n-1)
	        	{
	        	    if((arr[i] % 2 !=0) && (arr[i+1]%2 !=0))
	        	     System.out.print("*");
	        	     else if((arr[i] % 2==0) && (arr[i+1]%2==0))
	        	      System.out.print("#");
	        	      else
	        	       System.out.print("$");
	        	}
	    }
	
	}
}

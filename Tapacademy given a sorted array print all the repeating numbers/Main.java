/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
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
	    int c=1;
	    for(int i=0;i<n-1;i++)  // 1 1 2 2 2 3 4 4 
	    {
	        if(arr[i]==arr[i+1])
	        {
	            c++;
	            
	        }
	        else
	        {
	            if(c>1)
	            System.out.println(arr[i]);
	            
	            c=1;
	        }
	    }
		 if(c>1)
	            System.out.println(arr[n-1]);
	}
}

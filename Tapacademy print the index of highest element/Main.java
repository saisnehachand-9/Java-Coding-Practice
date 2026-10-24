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
	    int index=0;
	  
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	      int max=arr[0];
	     for(int i=0;i<n;i++)
	    {
	       if(arr[i]>max)
	       {
	           max=arr[i];
	           index=i;
	       }
	    }
		System.out.println(index);
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main // 1 2 3 4 5 6 7 
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	   
	  
	    for(int i=0;i<n-1;i++) 
	    {
	         for(int j=i+1;j<n;j++)
	        System.out.println(arr[i]+" "+arr[j]);
	    }
	 
	    
	}
}

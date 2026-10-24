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
	   
	  int max=0;
	    for(int i=0;i<n-1;i++)  
	    {
	        int sum=0;
	     for(int j=i+1;j<n;j++){
	           sum=arr[i]+arr[j];
	            if(sum>max)
	       max=sum;
	       sum=0;
	     }
	    }
	     System.out.println("max : "+max);
	}
}

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
	   
	  
	    for(int i=0;i<n;i++)  // 1 5 6 3 7 4  2nd=6
	    {
	         int c=0;
	        for(int j=0;j<n;j++){
	            if(i!=j){
	        if(arr[i]<arr[j])
	            c++;
	        }
	        }
	        if(c==1)
	        System.out.println(arr[i]);
	    }
	 
	    
	}
}

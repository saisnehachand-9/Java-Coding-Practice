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
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	    int x=0;
	     for(int i=0;i<n;i++)     
	    {
	        System.out.print(arr[i]+" ");
	      int ind=0;
	      for(int j=i;j<n;j++)
	      {
	          if(arr[i]==arr[j])
	               ind=j;
	      }
	      i=ind;
	    } 
	    
	    // IN another way
	    for(int i=0;i<n-1;i++)
	    {
	        if(arr[i]!=arr[i+1])
	        {
	            System.out.println(arr[i]);
	        }
	    }
	    System.out.println(arr[arr.length-1]);
	}
}
    
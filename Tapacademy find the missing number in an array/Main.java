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
	    int sum1=0;
	    int sum2=0;
	    int x=1;
	     for(int i=0;i<(n+1);i++)     //find the sum of all numbers
	    {
	       sum1=sum1+x;
	       x++;
	    }
	    for(int i=0;i<arr.length;i++)//find the sum of original array
	    {
	       sum2=sum2+arr[i];
	    }
		System.out.println("Missing number is : "+(sum1-sum2));
	}
}

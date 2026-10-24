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
	int c=0;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<=i;j++)
	    {
	        System.out.print(" * ");
	        c++;
	    }
	    System.out.println();
	}
	System.out.println(c);
	
	  // ANOTHER APPROACH
	  	System.out.println();
	  		System.out.println();
	  int count=0;
	  for(int i=0;i<n;i++)
	{
	   count=count+i+1;
	}
	System.out.println(count);
	}
}

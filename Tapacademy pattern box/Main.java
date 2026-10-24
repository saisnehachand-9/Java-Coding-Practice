/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);   // Here  'm' must be double(n)-1
	    int n=s.nextInt();                   // eg n=10,m=2(10)-1 =>19
	    int m=s.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<m;j++)
	        {
	           
	            if(i==j || (i+j)==m-1 || j==0 || j==m-1 || i==0 || i==n-1 || i==n/2 || j==m/2 ||  )
	            {
	              System.out.print("*  ");
	            }
	              else
	              System.out.print("   ");
	        }
	        System.out.println(" ");
	    }
		
	}
}



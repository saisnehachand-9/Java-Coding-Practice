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
	    
	    for(int i=2;i<=n/2;i++)
	    {
	       if(n%i==0){
	       c++;
	       break;
	       }
	    }
	    if(c==0)
	    System.out.println("prime");
	    else
	     System.out.println("Not prime");
	
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static String checkPrime(int n)
    {
        int c=0;
        for(int i=2;i<=n/2;i++)
	    {
	       if(n%i==0)
	          return "NOT PRIME";
	     }
	     return "PRIME";
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    System.out.println(  Main.checkPrime(n));
	    
	
	}
}

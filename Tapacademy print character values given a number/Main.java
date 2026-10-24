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
	    if(n>=65 && n<=90)
		System.out.println("CHARACTER VALUE : "+(char)n);
			else if(n>=97 && n<=122)
			System.out.println("CHARACTER VALUE : "+(char)n);
		else if(n>=48 && n<=57)
			System.out.println("CHARACTER VALUE : "+(char)n);
		
	}
}

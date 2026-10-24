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
	    if(n%3==0 && n% 5==0)
		System.out.println("TAP");
		else if(n%4==0)
			System.out.println("Acad");
		else if(n%3==0 )
			System.out.println("BTM");
			
	}
}

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
	if((n>=100)&&(n<=999)&&(n%10==0))
	  System.out.println("It satisfies the above condition");
	  else
	  System.out.println("It doesnt satisfy the above condition ");
	}
}

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
	if(n%100==0)
	  System.out.println("It contains a two '00' at the end ");
	  else
	  System.out.println("It doesn't contain a two '00' at the end ");
	}
}

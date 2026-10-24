/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n>=10 && n<=99)
	  System.out.println("It's a two digit number ");
	  else
	  System.out.println("It's not a two digit number ");
	}
}

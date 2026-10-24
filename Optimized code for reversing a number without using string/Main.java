/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    	System.out.println("Enter count");
	    	int count=s.nextInt();
	    for(int i=0;i<count;i++){
		System.out.println("Enter a number");
		int num=s.nextInt();
	    int rev=0;
		while(num>0)
		{
		    int x=num%10;
		    int y=num/10;
		    rev=rev*10+x;
		    num=y;
		}
		System.out.println("reverse of a number is : "+rev);
	    }
	}
}

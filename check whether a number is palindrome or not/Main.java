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
	    int num=s.nextInt();
	    int temp=num;
	    int rev=0;
	    while(num>0)
	    {
	        int x=num%10;
	        int y=num /10;
	        rev=rev*10+x;
	        num=y;
	    }
	    if(temp==rev)
	    System.out.println("Palindrome");
	    else
	    System.out.println("Not a Palindrome");
	}
}

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
	    System.out.println("Enter Count");
	    int count=s.nextInt();
	    while(count>0)
	    {
	    int n=s.nextInt();
	    int c=0;
	    while(n>0)
	    {
	        int x=n%10;
	        int y=n/10;
	        n=y;
	        c++;
	    }
		System.out.println(c);
		count--;
	    }
	}
}

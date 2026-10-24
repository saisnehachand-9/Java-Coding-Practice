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
	    System.out.println("enter count");
	     int count=s.nextInt();
	     for(int j=0;j<count;j++)
	     {
	         System.out.println("enter a number ");
	    int n=s.nextInt();//13
	    int c=0;
	    for(int i=1;i<=n/2;i++)
	    {
	        if(n % i ==0)
	          c++;
	    }
	    if(c==1)
		System.out.println("prime");
		else 
		System.out.println("not a prime");
	     }
	}
}

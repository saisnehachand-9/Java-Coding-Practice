/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int n1=0,n2=1,n3=0;
    static void fib(int no)
    {
        if(no>0)
        {
        n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
        fib(no-1);
        }
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	int no=s.nextInt();
	System.out.print(n1+" "+n2+" ");
	fib(no-2);
	}
}

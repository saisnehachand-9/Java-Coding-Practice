/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int fib(int input1)
    {
        int c=0;
        int n1=0,n2=1;
        int n3=0;
        while(c<=input1-2)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            c++;
        }
        return n3;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(fib(n));
	}
}

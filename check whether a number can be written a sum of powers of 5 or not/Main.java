/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static boolean PowerofX(int n, int x)
{
    
    while (n > 0)
    {
        int rem = n % x;
        if (rem >= 2)
        {
            return false;
        }
        n = n / x;
    }
    return true;
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	int c=0;
	while(c<N)
	{
	    int a=s.nextInt();
	    int b=5;
	    if (PowerofX(a, b))
         {
        System.out.print(a+" :  "+"PASSED");
         }
        else
        {
        System.out.print(a+" :  "+"FAILED");
            }
            c++;
	}
	}
}


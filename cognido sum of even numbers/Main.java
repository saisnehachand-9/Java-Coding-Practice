/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

********************************************************************************/
import java.util.*;
public class Main
{
    public static long sol(long n)
    {
        long sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i % 2 == 0)
               sum=sum+i;
        }
        return sum;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Long l=s.nextLong();
	System.out.println(sol(l));
	}
}

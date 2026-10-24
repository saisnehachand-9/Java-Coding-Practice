/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static int fact(int x)
    {
        if (x==1)
         return 1;
         else 
         return x*fact(x-1);
    }
	public static void main(String[] args) {
		int n=5;
		System.out.print(fact(n));
	}
}

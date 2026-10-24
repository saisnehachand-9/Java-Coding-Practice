/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int n=153;
	int temp=n;
	int sumcube=0;
	while(n >0)
	{
	    int rem=n % 10;
	    int pro=rem*rem*rem;
	    sumcube=sumcube+pro;
	    n=n/10;
	}
if(sumcube == temp)
   System.out.print("AMSTRONG");
   else
    System.out.print(" NOT AMSTRONG");
	}
}

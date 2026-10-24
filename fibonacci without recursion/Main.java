/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int n=8;
	int n1=n-2;
	int sum;
	int count=0;
	int a=0,b=1;
	System.out.print(a+" "+b+" ");
    while(n1 > 0)     // 0 1 1 2 3 5 8 13
    {
 sum=a+b;
 System.out.print(sum+" ");
 count=count+sum;
	a=b;
	b=sum;
	n1--;
    }
    System.out.println();
    System.out.println(count);
	}
}


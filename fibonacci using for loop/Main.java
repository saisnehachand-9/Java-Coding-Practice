/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,sum=0;
		int add=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<10;i++)
		{
		    sum=a+b;
		    System.out.print(sum+" ");
		    add=add+sum;
		    a=b;
		    b=sum;
		}
		System.out.println();
		System.out.print(add);
	}
}


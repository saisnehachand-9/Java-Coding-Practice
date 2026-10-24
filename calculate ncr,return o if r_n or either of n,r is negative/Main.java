/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); //10
		int r=s.nextInt(); //3
		int mul=1;
		int div=1;
		int c=0;
		int c1=r;
		if(n>r && r>0 && n>0)
		{
	while(c<c1)
	{
	    mul=mul*n; 
	    div=div*r; 
	    n--;
	    r--;
	    c++;
	}
	System.out.println(mul);
	System.out.println(div);
	int x=mul/div;
	System.out.println(x);
		}
		else{
		    System.out.println(0);
		}
	
	}
}

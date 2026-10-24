/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int n1=s.nextInt();//50
		int n2=s.nextInt();//55
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
		    int no=i;
		    while(no > 0)
		    {
		        int rem=no % 10;
		        sum=sum+rem;
		        no=no/10;
		    }
		    
		}
		System.out.println(sum);
	}
}

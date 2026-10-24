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
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
		    int x=i;
		    int sum=0;
		    int n1=0,n2=1;
		    while(sum<x)
		    {
		        sum=n1+n2;
		        n1=n2;
		        n2=sum;
		    }
		    //System.out.println(sum);
		    if(sum==x)
		       System.out.println(x);
		    		}
	}
}

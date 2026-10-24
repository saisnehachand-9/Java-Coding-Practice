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
	int n=s.nextInt();
	int m=s.nextInt();
	int sum=0;
	for(int i=n;i<=m;i++)
	{
	    int l=i;
	    int c=0;
	    for(int j=1;j<=l;j++)
	    {
	        if(l % j ==0)
	         c++;
	    }
	    if(c ==2)
	      sum=sum+i;
	}
	System.out.println(sum);
	}
}

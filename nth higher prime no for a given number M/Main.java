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
		int n1=s.nextInt();
		int n2=s.nextInt();
		int c=0;
	    for(int i=n1+1;i>=0;i++)
	    {
	        int count=0;
	        for(int j=1;j<=i;j++)
	        {
	            if(i % j == 0)
	                   count++;
	        }
	        if(count ==2)
	        {
	            c++;
	        }
	        if(c==n2)
	             {
	                 System.out.println(i);
	                 break;
	             }
	    }
	}
}


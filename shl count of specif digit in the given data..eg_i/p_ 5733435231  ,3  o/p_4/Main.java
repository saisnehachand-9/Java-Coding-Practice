/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int funcCount(int data,int digit)
    {
        int c=0;
        while(data > 0)
	     {
	    int rem=data % 10;
	    if(rem==digit)
	        c++;
	        data=data/10;
	    	}
	    	return c;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int d=s.nextInt();
	
	System.out.println(funcCount(n,d));
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{

	public double returnhighest(int x,int y)
	{
	    double z=Math.pow(x,y);
	        return z;
	}
	
		public static void main(String[] args) {
	         Scanner s=new Scanner(System.in);
	         int a=s.nextInt();
	         int b=s.nextInt();
	         Main c=new Main();
	        System.out.println(c.returnhighest(a,b));
	}
}

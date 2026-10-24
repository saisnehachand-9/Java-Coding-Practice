/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    	static int n1=0;
	static int n2=1;
	static int sum=1;
	static int c=0;
		 static int recursion(int x)//4 3
		{
		    
	     if(x>0)
		    {
		          c=n1+n2;
		         sum=sum+c;//1 
		        n1=n2;//1
		        n2=sum;//1
		        recursion(x-1);//3
		        
		    }
		    return sum;
		}
		public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(recursion(n-2));
		
	}
}

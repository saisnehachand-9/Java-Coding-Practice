/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
   public  static String add(int x)
    {
        if(x % 2==0)
         return "even";
         else
           return "odd";
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter count");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    System.out.println("enter number");
		int a=s.nextInt();
		String y=add(a);
		System.out.println(y);
		}
		
	}
}

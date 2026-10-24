/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    int c1=0,c2=0;
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)=='a')
	              c1++;
	           if(s1.charAt(i)=='b')
	               c2++;
	    }
	System.out.println(c1+" "+c2);
	if(c1 < c2)
	   System.out.println(c1);
	   else if(c2 < c1)
	       System.out.println(c2);
	       else
	       System.out.println(c1);
	}
}

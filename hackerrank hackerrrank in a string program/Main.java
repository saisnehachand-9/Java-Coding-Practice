/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1="hackerrank";
	String s=sc.next();
	int ca=0;
	int c=0;
	for(int i=0;i<s.length();i++)
	{
	    
	        if(s.charAt(i)==s1.charAt(ca))
	          {
	              c++;
	              ca++;
	              	System.out.println(s.charAt(i));
	              
	          }
	          if(c==10)
	              break;
	    }
	System.out.println(c);
	}
}

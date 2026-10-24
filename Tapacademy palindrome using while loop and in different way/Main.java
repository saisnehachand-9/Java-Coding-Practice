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
	    Scanner s=new Scanner(System.in);
	   String s1=s.next();  // appa MALAYALAM
	  int i=0,j=s1.length()-1;
	  int c=0;
	  while(i<j)
	  {
	      if(s1.charAt(i)!=s1.charAt(j)){
	         System.out.println("false");
	         c++;
	      }
	       i++;j--;
	   }
	   if(c==0)
		System.out.println("palindrome");
	}
}


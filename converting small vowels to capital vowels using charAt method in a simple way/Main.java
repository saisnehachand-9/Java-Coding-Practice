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
	    String s1=s.nextLine();
	    String s2="";
	    for(int i=0;i<s1.length();i++)
	    {
	         char c=s1.charAt(i);
	        if((s1.charAt(i)=='a') || (s1.charAt(i)=='e') ||  (s1.charAt(i)=='i') || (s1.charAt(i)=='o') || (s1.charAt(i)=='u'))
			{
			   c=Character.toUpperCase(c);
			    s2=s2+c;
			 }
			 else{
			   s2=s2+c;  
			 }
			
	    }
		System.out.println(s2);
	}
}

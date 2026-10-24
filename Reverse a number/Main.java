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
	    Scanner s= new Scanner(System.in);
	    int a=s.nextInt();//1234
	    String s1=String.valueOf(a);
	    String rev="";
	    for(int i=s1.length()-1;i>=0;i--)
	    {
	        rev=rev+s1.charAt(i);
	    }
	    
		System.out.println(Integer.valueOf(rev));
	}
}

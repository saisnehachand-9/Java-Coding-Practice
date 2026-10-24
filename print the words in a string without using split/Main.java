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
	String s1="sai s
	neha     chand";
	 String x=" ";
	for(int i=0;i<s1.length();i++)
	{
	   if(s1.charAt(i)!=' ')
	          x=x+s1.charAt(i);
	          if(i==s1.length()-1 && s1.charAt(i)!=' ')
	              System.out.println(x);
	          if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
	               {
	                   System.out.println(x);
	                   x=" ";
	               }
	               
	}
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s1="hello malayalam tot";
		String arr[]=s1.split(" ");
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
		 String s=arr[i];
		 String rev="";
		 for(int j=s.length()-1;j>=0;j--)
		 {
		     rev=rev+s.charAt(j);
		 }
		 if(rev.equals(s))
		 {
		     c++;
		     System.out.println(rev);
		 }
		}
		System.out.println("no of palindromes are :"+c);
	}
}

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
	int i=4664;
	String s=String.valueOf(i);
	String rev="";
	for(int j=s.length()-1;j>=0;j--)
	{
	    rev=rev+s.charAt(j);
	}
	int k=Integer.valueOf(rev);
	if(i == k)
	{
	    System.out.print("it is a palindrome"+i);
	}
	}         
}

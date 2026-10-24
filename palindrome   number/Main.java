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
	int temp=i;
	String rev="";
	while(temp>0)
	{
	    int rem=temp%10;
	   rev=rev+String.valueOf(rem);
	   temp=temp/10;
	}
	System.out.print(rev);
		System.out.print(temp);
	if(i==Integer.valueOf(rev))
	    System.out.print("palindrome");
	}         
}


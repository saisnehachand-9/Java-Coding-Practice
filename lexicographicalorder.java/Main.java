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
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();// aabcc
	int a[]=new int[26];
	for(int i=0;i<s1.length();i++) //a a b c c
	{
	    int ch=s1.charAt(i)-97;//  0 0 1 2 2 
	    a[ch]++; //a[0]=1 a[0]=2 a[1]=1 a[2]=1 a[2]=2
	}
	for(int j=1;j<=s1.length();j++)
	{
	   for(int k=0;k<26;k++)
	   {
	       if(a[k]==j)
	       {
	       while(a[k]-- > 0)
	       {
	           System.out.print((char)('a'+j));
	       }
	       }
	   }
	}
	System.out.println();
	}
}

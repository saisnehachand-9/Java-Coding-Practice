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
	int j=456;
	String rev="";
	String s=String.valueOf(j);
	StringBuilder sb=new StringBuilder(s);
	for(int i=0;i<sb.length();i++)
	{
	    if(i!=0)
	       sb.setCharAt(i,'0');
	       
	}
	System.out.println(sb);
	}
}

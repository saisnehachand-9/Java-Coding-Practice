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
	String s1="1234";
	String s2="23";
	String newstr="";
	ArrayList<Character> list=new ArrayList<Character>();
	for(int i=0;i<s2.length();i++)
	{
	    list.add(s2.charAt(i));
	}
	System.out.println(list);
	for(int j=0;j<s1.length();j++)
	{
	    if(!list.contains(s1.charAt(j)))
	      newstr=newstr+s1.charAt(j);
	}
	System.out.println(newstr);
	}
}

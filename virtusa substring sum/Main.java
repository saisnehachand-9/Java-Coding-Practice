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
	String s1="16";
	ArrayList<Integer> list=new ArrayList<Integer>();
	int sum=0;
	for(int i=0;i<s1.length();i++)
	{
	   for(int j=i+1;j<=s1.length();j++)
	   {
	       String sub=s1.substring(i,j);
	       	sum=sum+Integer.valueOf(sub);
	   }
	}
	System.out.println(sum);
	}
}

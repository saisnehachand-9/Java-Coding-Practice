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
	String s1=s.nextLine();
	String s2=s.nextLine();
	int c=0;
	char ch='\u0000';
	for(int i=0;i<s2.length();i++)
	{
	    if(s2.charAt(i)==s1.charAt(i))
	       c++;
	}
	if(c==s2.length())
	   System.out.println(s1.charAt(s1.length()-1));
	   else{
	       for(int j=0;j<s2.length();j++)
	         {
	    if(s2.charAt(j)!=s1.charAt(j))
	       ch=s1.charAt(j);
	         }
	         System.out.println(ch);
	   }
	   }
}

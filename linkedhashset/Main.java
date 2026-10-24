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
	LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
	String s="saisneha";
		String res="";
	for(int i=0;i<s.length();i++)
	{
	    set1.add(s.charAt(i));
	}
	System.out.print(set1);
for(Character j:set1)
{
    res=res+j;
}
System.out.print(res);

	}
}

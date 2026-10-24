/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	String s="SaiSneHA";
	StringBuffer s1=new StringBuffer(s);
	for(int i=0;i<s.length();i++)
	{
	    if(Character.isLowerCase(s.charAt(i)))
	       s1.setCharAt(i,Character.toUpperCase(s.charAt(i)));
	       else
	       s1.setCharAt(i,Character.toLowerCase(s.charAt(i)));
	}
	System.out.print(s1.toString());
	}
}


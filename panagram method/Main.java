/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	int count=0;
	String a="PANAGRAMS";
	String b="NOT PANAGRAMS";
	String anagrams(String x)
	{
	    if(x.length()>=26)
	    {
	        String s=x.toLowerCase();
	        for(char ch='a';ch<='z';ch++)
	        {
	            if(s.indexOf(ch)>=0)
	               count++;
	        }
	    }
	}
	public static void main(String[] args) {
	}
}

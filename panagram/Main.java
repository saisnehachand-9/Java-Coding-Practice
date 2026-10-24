/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	String s="abcdeffghijklmnoppqrstuvwxyz";
	int count=0;
	for(char ch='a';ch<='z';ch++)
	{
	    if(s.indexOf(ch)>=0)
	        count++; 
	}
	if(count==26)
	   System.out.print("PANAGRAMS");
	   else
	   System.out.print("NOT PANAGRAMS");
	}
}

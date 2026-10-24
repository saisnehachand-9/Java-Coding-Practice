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
	for(int j=0;j<s1.length();j++) // a s d s
	{
	    int c=0;
	    for(int k=0;k<s1.length();k++) // a s d s
	    {
	        if(s1.charAt(j)==s1.charAt(k))
	          c++;
	    }
	    if(c ==1)
	    {
	        System.out.println(s1.charAt(j)+" "+"index : "+(j+1));
	        break;}
	}
	}
}


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
	    int c=s.nextInt();
	    String s2="";
	    for(int k=c;k<s1.length();k++)
		{
		    s2=s2+s1.charAt(k);
		}
	    for(int i=0;i<c;i++)
	    {
	        s2=s2+s1.charAt(i);
	    }
	    System.out.println(s2);
		
	}
}

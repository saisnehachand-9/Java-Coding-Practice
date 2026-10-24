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
	    char ch[]=s1.toCharArray();
	    for(int i=0;i<s1.length();i++)
	    {
	         System.out.print(ch[i]);
	    }
	    System.out.println();
	    for(int i=s1.length()-1;i>=0;i--)
	    {
	        System.out.print(ch[i]);
	    }
	    
	    System.out.print(Arrays.toString(ch));
		
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String newStr="";
	         //s1= s1.trim();
		for(int i=0;i<s1.length();i++)
		{
		   if(s1.charAt(i)!=' ')
		   {
		       newStr=newStr+s1.charAt(i);
		   }
		}
		
		    System.out.println(newStr);
		    //System.out.println(" consonants: "+consonants);
	}
}

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
	    s1=s1.replace(" ","");
	    s2=s2.replace(" ","");
	    s1=s1.toLowerCase();
	     s2=s2.toLowerCase();
	     if(s1.length()==s2.length())
	     {
	         char ch1[]=s1.toCharArray();
	         char ch2[]=s2.toCharArray();
	         Arrays.sort(ch1);
	         Arrays.sort(ch2);
	         if(Arrays.equals(ch1,ch2))
	         {
	             System.out.print("these r anagrams");
	         }
	         else
	           System.out.print("these r  not anagrams");
	     }
	     else
	           System.out.print("these r  not anagrams");
	}
}

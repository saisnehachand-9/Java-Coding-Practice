/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
   static  String a="palindrome";
    static String b="not a palindrome";
    static String ispalindrome(String x)
    {
        if(x.length()==0 || x.length()==1)
          return a;
          if(x.charAt(0)==x.charAt(x.length()-1))
              return ispalindrome(x.substring(1,x.length()-1));
              else
              return b;
    }
    
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	System.out.print(ispalindrome(s1));
	}
}

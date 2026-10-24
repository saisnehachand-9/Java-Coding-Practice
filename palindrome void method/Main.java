/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void palindrome(String x)////hiih
    {
        if(x.length()==0 || x.length()==1)
           System.out.print("PALINDROME");
       else
       {
           
          if(x.charAt(0)==x.charAt(x.length()-1))
                   palindrome(x.substring(1,x.length()-1));
            else 
            System.out.print("NOT A PALINDROME");
       }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	palindrome(s1);
	}
}

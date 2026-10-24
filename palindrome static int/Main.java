/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int palindrome(String x)
    {
        if(x.length()==1 || x.length()==0)
            return 1;
            if(x.charAt(0)==x.charAt(x.length()-1))
                return palindrome(x.substring(1,x.length()-1));
              else 
                return 0;
            
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.print(palindrome(s1));
	}
}

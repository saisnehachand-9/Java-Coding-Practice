/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{

    static String reverse(String x)
    {
//sai
        String rev="";
        while(x.length()>0)
        {
            rev=rev+x.charAt(x.length()-1);
         x=x.substring(0,x.length()-1);
        }
         return rev;   
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.print(reverse(s1));
	}
}


/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static String solve(String s)
    {
        int x=Integer.valueOf(s);
        int y=x*2;
        return String.valueOf(y);
    }
	public static void main(String[] args) {
	Scanner so=new Scanner(System.in);
	String s1=so.nextLine();
	System.out.println(solve(s1));
	}
}

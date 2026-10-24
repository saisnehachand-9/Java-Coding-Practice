/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public int palindrome(String input1){
    String rev="";
    for(int i=input1.length()-1;i>=0;i--)
    {
        rev=rev+input1.charAt(i);
    }
    if(input1.equals(rev))
           return 1;
           else
           return 0;
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	Main m=new Main();
System.out.println(	m.pal(s1));
	}
}


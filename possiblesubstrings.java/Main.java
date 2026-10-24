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
		String s1=s.next();
		String sub;
		int i,j,length;
	 length=s1.length();
		for(i=0;i<length;i++)
		{
		    for(j=i+1;j<=length;j++)
		    {
		        sub=s1.substring(i,j);
		        System.out.println(sub);
		    }
		}
	}
}


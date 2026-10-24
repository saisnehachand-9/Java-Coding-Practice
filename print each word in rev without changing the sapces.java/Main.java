/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s1.replaceAll("\\s","");
		int j=s2.length()-1;
		for(int i=0;i<s1.length();i++)
		{
		    if(s1.charAt(i)==' ')
		    {
		        System.out.print(" ");
		    }
		    else{
		        System.out.print(s2.charAt(j));
		        j--;
		    }
		}
		
	}
}

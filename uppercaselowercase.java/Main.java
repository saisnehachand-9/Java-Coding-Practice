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
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
		    if(Character.isUpperCase(ch[i]))
		          ch[i]=Character.toLowerCase(ch[i]);
		          else if(Character.isLowerCase(ch[i]))
		              ch[i]=Character.toUpperCase(ch[i]);
		}
		//s1=new String(ch);
		//s1=String.valueOf(ch);
		System.out.print(ch);
	}
}

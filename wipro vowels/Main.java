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
		String s1=s.nextLine(); //sneha
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<s1.length();i++)
		{
		    if((s1.charAt(i)=='a') || (s1.charAt(i)=='e') || (s1.charAt(i)=='i') || (s1.charAt(i)=='o') || (s1.charAt(i)=='u'))
		          list.add(s1.charAt(i));
		}
		System.out.println(list);
		StringBuilder sb=new StringBuilder(s1);
		for(int j=list.size()-1;j>=0;j--)
		{
		    char ch=list.get(j);
		    for(int m=0;m<s1.length();m++)
		    {
		         if((s1.charAt(m)=='a') || (s1.charAt(m)=='e') || (s1.charAt(m)=='i') || (s1.charAt(m)=='o') || (s1.charAt(m)=='u'))
		              {
		                  sb.setCharAt(m,ch);
		                 break;
		              }
		              
		    }
		}
		System.out.println(sb);
	}
}

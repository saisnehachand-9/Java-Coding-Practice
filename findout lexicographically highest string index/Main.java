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
		String s2=s.nextLine();
		int index=s1.indexOf(s2);
		String newstr="";
		int c=0;
		if(index > 0){
		for(int i=index;i<s1.length();i++)
		{
		    newstr=newstr+s1.charAt(i);
		    c++;
		}}
		System.out.println(newstr+" "+"length is: "+c);
	}
}

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
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<s1.length();i++)
	{
	    char ch=s1.charAt(i);
	    int j=ch;
	    list.add(j);
	}
	Collections.sort(list);
int a=list.get(0);
int b=list.get(list.size()-1);
System.out.println(a+b);
	}
}

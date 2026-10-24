/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String arr[]=s1.split(" ");
	System.out.println(Arrays.toString(arr));
	int c=1;
	for(int i=0;i<s1.length()-1;i++)
	{
	    if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
	        c++;
	}
	System.out.println(c);
	System.out.println(s1.length());
	}
}

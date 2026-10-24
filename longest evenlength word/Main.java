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
	    String arr[]=s1.split(" ");//saii sneha chand
	    String highest="";
	    for(int i=0;i<arr.length;i++)
	    {
	      int len=arr[i].length();
	      if((len % 2 ==0)&& len>highest.length())
	          highest=arr[i];
	    }
		System.out.println(highest);
	}
}

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
		String arr[]=s1.split(" ");
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
		    String str=arr[i];
		    String rev="";
		    for(int j=str.length()-1;j>=0;j--)
		    {
		        rev=rev+str.charAt(j);
		    }
		    if(rev.equals(str))
		          c++;
		}
		System.out.println(c);
	}
}

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
	String rev="";
	for(int i=arr.length-1;i>=0;i--)
	{
	    String str=arr[i];
	    String res="";
	    for(int j=str.length()-1;j>=0;j--)
	    {
	        res=res+str.charAt(j);
	    }
	     rev=rev+res+" ";
	}
	System.out.print(rev); 
	}
}

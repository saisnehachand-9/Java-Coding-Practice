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
	String newrev="";
	for(int i=0;i<arr.length;i++)
	{
	    String x=arr[i];
	    String rev="";
	    for(int j=x.length()-1;j>=0;j--)
	    {
	        rev=rev+x.charAt(j);
	    }
	     newrev=newrev+rev;
	    if(i!=arr.length-1)
	        newrev=newrev+"-";
	}
	System.out.println(newrev);
	}
}

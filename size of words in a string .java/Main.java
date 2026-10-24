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
	int len[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
	    len[i]=arr[i].length();
	}
	Arrays.sort(len);
	int max=len[len.length-1];
	for(int j=1;j<=max;j++)
	{
	    int c=0;
	    for(int k=0;k<arr.length;k++)
	    {
	        if(j==len[k])
	          c++;
	    }
	    System.out.println("size of"+" "+j+"is"+c);
	}
	}
}

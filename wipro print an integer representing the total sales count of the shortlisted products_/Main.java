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
	int n=s.nextInt();
	char arr[]=new char[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.next().charAt(0);
	}
	for(int j=0;j<arr.length;j++){
	    char l=arr[j];
	    for(int m=0;m<s1.length();m++)
	    {
	        if(l==s1.charAt(m))
	        {
	            int z=l;
	            sum=sum+z;
	        }
	    }
	}
	System.out.println(sum);
	}
}

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
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	    int x=arr[j];
	    String s1=String.valueOf(x);
	    int sum=0;
	    for(int m=0;m<s1.length();m++)
	    {
	        int y=Character.getNumericValue(s1.charAt(m));
	        if(y % 2 ==0)
	          sum=sum+y;
	    }
	    System.out.print(sum+" ");
	}
	}
}

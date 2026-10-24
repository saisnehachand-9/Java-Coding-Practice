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
	int max=0;
	int a=0;
	int b=0;
	for(int j=0;j<n;j++)
	{
	    for(int k=0;k<n;k++)
	    {
	        if(j !=k)
	        {
	            int prod=arr[j]*arr[k];
	            if(prod > max)
	            {
	                max=prod;
	                a=j;
	                b=k;
	            }
	        }
	    }
	}
	System.out.println(a+b);
	}
}

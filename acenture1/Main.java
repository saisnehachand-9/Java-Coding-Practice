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
		int l=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		System.out.print(Arrays.toString(arr));
	while(l<n)
	{
	    int sum1=0,sum2=0;
	    System.out.println(arr[l]+" "+"-->");
	    for(int k=0;k<n;k++)
	    {
	        if(arr[k]<arr[l])
	           sum1=sum1+arr[k];
	           else if(arr[k]>arr[l])
	           sum2=sum2+arr[k];
	           else{
	               
	           }
	    }
	    System.out.println(sum1*sum2);
	    l++;
	}
	}
}

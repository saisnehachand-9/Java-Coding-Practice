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
	int sum=0;
	int arr[]=new int[n];
		for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	int y=n%2;
	int m=n/2;
	if( y == 0)
	{
	    sum=arr[m]+arr[m-1];
	}
	else{
	    sum=arr[m];
	}
	System.out.println(sum);
	}
}



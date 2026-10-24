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
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.print(Arrays.toString(arr));
		int c=0;
		for(int j=0;j<arr.length;j++)
		{
		    if((a%arr[j] == 0)&& (b % arr[j]==0))
		       c++;
		}
		System.out.print(c);
	}
}


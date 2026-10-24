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
		int x=n/2;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int max=arr[0];
		for(int j=0;j<n;j++)
		{
		    int c=1;
		    for(int k=j+1;k<n;k++)
		    {
		        if(arr[j]==arr[k])
		          c++;
		    }
		    if(c>x)
		      max=arr[j];
		}
		System.out.println(max);
	}
}

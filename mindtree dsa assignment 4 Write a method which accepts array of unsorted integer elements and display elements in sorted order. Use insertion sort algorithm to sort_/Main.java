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
		for(int i=1;i<n;i++)
		{
		    int key=arr[i];
		    int j=i-1;//0
		    while(j>=0 && arr[j]>key)
		    {
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
}

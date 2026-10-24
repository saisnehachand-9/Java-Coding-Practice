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
	int n=s.nextInt();
	int arr[]=new int[n]; // 23 1 12 56 17
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    for(int j=i+1;j<n;j++)
	    {
	        if(arr[j]>arr[i])
	        {
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	    }
	}
	System.out.println(Arrays.toString(arr));
	}
}

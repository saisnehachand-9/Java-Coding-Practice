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
		System.out.println("Enter count");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=s.nextInt();
		}
		int large=0;
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]>large)
		     large=arr[i];
		     if(arr[i]<small)
		     small=arr[i];
		}
		
		System.out.println("large number is : "+large);
			System.out.println("small number is : "+small);
	}
}

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
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=s.nextInt();
		}
		System.out.println("Enter a element you want to search");
		int search=s.nextInt();
		int storeIndex=0;
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]==search)
		   {
		     storeIndex=i;
		     c++;
		   }
		}
		
	  if(c==1)
	      System.out.println("Element found at "+storeIndex);
	      else
	       System.out.println("Element not found");
	}
}

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
		for(int i=0;i<arr.length;i++)
		{
		     if(i<arr.length-1)
		    System.out.print(arr[i]+",");
		    else
		    System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}

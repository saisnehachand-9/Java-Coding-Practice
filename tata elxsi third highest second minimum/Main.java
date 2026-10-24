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
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	int sum=0; // 1 2 3 4 5 6
	int high=0;
	int small=0;
	Arrays.sort(arr); // 3 4 6 8 9 10 15 17 
	System.out.println(Arrays.toString(arr));
	    //int x=arr.length-3;
	    high=arr[arr.length-3];
	    small=arr[1];
	   

	System.out.println(high+small);
	}
}

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
		int arr[]={1,2,1,4,5,8,9,8,10,5,4}; //1 1 1 2 4 4 5
		HashSet<Integer> set=new HashSet<Integer>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
		    if(i+1< arr.length)
		        {
		            if(arr[i]==arr[i+1])
		            {
		              set.add(arr[i]);
		              i=i+1;
		            }
		        }
		}
		System.out.print(set);
		
	}
}

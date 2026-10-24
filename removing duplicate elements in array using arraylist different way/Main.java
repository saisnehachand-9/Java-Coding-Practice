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
		int arr[]={1,2,4,1,1,5,2,2,4}; // 1 1 1 2 2 2 2 4 4 5
		Arrays.sort(arr);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		    if(i+1<arr.length)
		    {
		        if(arr[i]==arr[i+1])
		        {
		            if(!list.contains(arr[i]))
		            {
		            list.add(arr[i]);
		        
		            }
		        }
		    }
		}
		System.out.print(list);
		HashSet<Integer> set=new HashSet<Integer>(list);
		System.out.print(set);
	}
}

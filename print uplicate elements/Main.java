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
		int arr[]=new int[n];    // 1 2 4 2 5 1 7 4
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		HashSet<Integer> set=new HashSet<Integer>();
	    Arrays.sort(arr); // 1 1 2 2 4 4 5 7
	    System.out.println(Arrays.toString(arr));
	    for(int j=0;j<n;j++)
	    {
	        
	        for(int k=j+1;k<n;k++)
	        {
	            if(arr[j]==arr[k])
	            {
	                 set.add(arr[j]);
	            }
	        }
	            
	               
	            
	    }
	    System.out.println(set);
	}
}

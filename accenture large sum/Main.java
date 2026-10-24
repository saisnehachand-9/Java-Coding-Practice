/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int largesum(int Arr[])
    {
       ArrayList<Integer> even=new ArrayList<Integer>();
       ArrayList<Integer> odd=new ArrayList<Integer>();
       for(int i=0;i<Arr.length;i++)
       {
           if(i % 2 == 0)
                even.add(Arr[i]);
                else
                odd.add(Arr[i]);
       }
       Collections.sort(even);
       Collections.sort(odd);
      return even.get(even.size()-2)+odd.get(1);
      
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	System.out.print(largesum(arr));
	}
}

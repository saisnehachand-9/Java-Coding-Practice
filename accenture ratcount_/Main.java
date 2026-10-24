/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int ratcount(int x,int y,int arr[])
    {
        int suff=0;
        int c=0;
        if(arr.length == 0)
           return -1;
           else
           for(int j=0;j<arr.length;j++)
           {
               suff=suff+arr[j];
               c++;
               if(suff >= x*y)
               {
                   break;
               }
           }
           if(c > 0)
              return c;
              else
              return 0;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int unit=s.nextInt();
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		System.out.print(ratcount(r,unit,arr));
		}
}

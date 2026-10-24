/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
  static  int[] arraychallenge(int arr[],int l) // 1 2 3 4 5
    {
        int newarr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int prod=1;
            for(int j=0;j<l;j++)
            {
                if(i !=j)
                  prod=prod*arr[j];
            }
            newarr[i]=prod;
        }
        return newarr;
        
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Arr[]=new int[n];
		for(int k=0;k<n;k++)
		{
		    Arr[k]=s.nextInt();
		}
		int Array[]=(arraychallenge(Arr,n));
		for(int k=0;k<n;k++)
		{
		    System.out.print(Array[k]);
		    if(k!=n-1)
		       System.out.print("-");
		}
		}
}


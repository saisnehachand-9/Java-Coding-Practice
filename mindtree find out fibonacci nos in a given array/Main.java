/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int  numFibonacci(int[] arr)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            int f1=0,f2=1;
            int sum=0;
            int x=arr[i];  //1
            while(sum<x) 
            {
               sum= f1+f2;  
               f1=f2; 
               f2=sum;
            }
            if(sum==x)
               c++;
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Arr[]=new int[n];
		for(int a=0;a<n;a++)
		{
		    Arr[a]=s.nextInt();
		}
		int resu=numFibonacci(Arr);
		System.out.println(resu);
	}
}



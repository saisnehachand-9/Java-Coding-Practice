/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int check(int Arr[],int l,int no,int diff) /// 1 2 3 4 5
    {  
        int c=0;
        for(int m=0;m<l;m++)
        {
            if(Math.abs(no-Arr[m])<=diff)
            {
                System.out.println("e"+" "+(no-Arr[m]));
                c++;
            }
        }
        if(c > 0)
           return c;
           else 
           return -1;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	   arr[i]=s.nextInt();
	}
	int num=s.nextInt();
	int difference=s.nextInt();
	System.out.print(check(arr,n,num,difference));
	}
}

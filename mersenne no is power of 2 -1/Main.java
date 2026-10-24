/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int sum=0;
    static void disp(int a)
    {
         
	   for(int k=1;k<=a;k++)
	   {
	       double d=Math.pow(2,k);
	       if(d-1==a)
	          sum(a);
	   }
        
    }
    static void sum(int s1)
    {
     sum=sum+s1;   
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//ArrayList<Integer> list=new ArrayList<Integer>();
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	    if(arr[j] > 0)
	        disp(arr[j]);
	}
	System.out.println(sum);
	}
}

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
		int arr[]=new int[n];  // 1 2 3 4 5
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		    sum=sum+arr[j];
		}
		System.out.println(sum);
		int sum1=sum;
		for(int k=0;k>=0;k++)
		{
		    int c=0;
		    sum1=sum1+k;  //15
		    for(int l=1;l<=sum1/2;l++)
		    {
		        if(sum1%l==0)
		              c++;
		    }
		    System.out.println("sum1: "+sum1+" "+"count: "+c);
		    if(c==1)
		         {
		             System.out.println(sum1);
		             System.out.println("count:"+k);
		             break;
		         }
		         sum1=sum;
		}
	}
}


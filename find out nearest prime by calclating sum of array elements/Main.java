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
		int arr[]=new int[n];
		int sum=0;
for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		    sum=sum+arr[j];
		}
		int x=sum;  //68
		int k=0;
		System.out.println(sum);
		while(x > 0)
		{
		    int c=0;
		    x=x+k;  
		    for(int a=1;a<=x;a++)
		    {
		        if(x % a ==0)
		         c++;
		    }
		    if(c==2)
		    {
		        System.out.println(k);
		        System.out.println(x);
		        break;
		    }
		    else
		    {
		    x=sum;
		    k++;
		    }
		}
	}
}
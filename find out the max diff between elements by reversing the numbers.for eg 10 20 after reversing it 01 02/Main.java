/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int small,big;
     public static int maxab(int a[],int n)
	    {
	        int diff=0;
	        for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                int x=a[i];
	                int y=a[j];
	                String rev1="";
	                String rev2="";
	                   while(x>0)
	                   {
	                       int rem=x%10; //01
	                       rev1=rev1+String.valueOf(rem);
	                        x=x/10;//1
	                   }
	                   while(y>0)
	                   {
	                       int rem=y%10;
	                       rev2=rev2+String.valueOf(rem);
	                        y=y/10;
	                   }
	                   int sub=Math.abs(Integer.valueOf(rev1)-Integer.valueOf(rev2));
	                   if(sub>diff)
	                   {
	                      diff=sub;
	                      small=a[i];
	                      big=a[j];
	                   }
	            }
	        }
	        return diff;
	    }
	public static void main(String[] args) {
	   
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
		int max=maxab(arr,n);
		System.out.println(small+" "+big);
		System.out.println(max);
	}
}

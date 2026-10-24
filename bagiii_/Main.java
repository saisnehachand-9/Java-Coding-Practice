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
	    int temp[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        temp[i]=arr[i];
	    }
	    int newarr[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
	       int sum=arr[i];
	       int k=0;
	       for(int j=0;j<n;j++)
	       {
	           if(j==i)
	            {
	                arr[k]=arr[j];
	                k++;
	            }
	            else
	            {
	                sum=sum+arr[j];
	                arr[k]=sum;
	                k++;
	                
	            }
	           
	       }
	       System.out.println(Arrays.toString(arr));
	       for(int m=0;m<n;m++)
	       {
	           arr[m]=temp[m];
	       }
	   }
	}
}

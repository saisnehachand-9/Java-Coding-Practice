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
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
		Arrays.sort(arr);
ArrayList<Integer> list=new ArrayList<Integer>();
		for(int j=0;j<n;j++)
		{
		    for(int k=j+1;k<n;k++)
		    {
		       int diff=arr[k]-arr[j];
		       list.add(diff);
		    }
		}
		Collections.sort(list);
		int min=list.get(0);
		for(int m=0;m<n;m++)
		{
		    for(int l=0;l<n;l++)
		    {
		        if(arr[l]-arr[m]==min)
		        {
		            System.out.println(arr[m]+" "+arr[l]);
		        }
		    }
		}
	}
}



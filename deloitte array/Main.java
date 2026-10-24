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
		int arr[]=new int[n];  //8 10 15 3 25 4
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		int l=0;
		int B[]=new int[n];
		int a=arr[0];
		int newarr1[]=new int[n];
		int newarr2[]=new int[n];
		while(l<x)
		{
		    for(int j=0;j<n;j++)
		    {
		        //8 2
		        if(j==0 )
		           a=arr[0];
		        if(j==n-1)
		        {
		            B[j]= Math.abs(arr[j]-a); //4
		            arr[j]=B[j];//4
		        }
		        else{
		        int y=j+1;
		        B[j]= Math.abs(arr[j]-arr[y]);
		        arr[j]=B[j];
		        }
		    }
		    //System.out.println(Arrays.toString(B));
		   if(l==x-2)
		        for(int c=0;c<n;c++)
		            newarr2[c]=B[c];
		   if(l==x-1)
		         for(int d=0;d<n;d++)
		            newarr1[d]=B[d];
		    
		         
		    l++;
		    
		}
		System.out.println("A :"+Arrays.toString(newarr1));
			System.out.println("B :"+Arrays.toString(newarr2));
	}
}

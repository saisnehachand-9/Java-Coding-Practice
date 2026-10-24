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
		int arr[][]=new int[n][n];
		int sum1=0,sum2=0;
		int y=0,c1=0,c2=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		    arr[i][j]=s.nextInt();
		    }
		}
		int x=s.nextInt(); //6
		for(int m=0;m<n;m++)
		{
		    for(int n1=0;n1<n;n1++)
		    {
		        if(arr[m][n1]==x)
		        {
		          y=m+1+n1+1;
		           break;
		        }
		           
		    }
		}
		System.out.println(y);
		if(y % 2 ==0)
		      c1++;
		    	for(int a=0;a<n;a++)   // 1 22 33
		{
		    for(int b=0;b<n;b++)
		    {
		        if(y % 2 == 0)
		        {
		    if(arr[a][b] % 2== 0)
		    {
		        int l=arr[a][b];
		        while(l > 0)
		        {
		            int rem=l%10;
		            sum1=sum1+rem;
		            l=l/10;
		            
		        }
		        
		    }
		        }
		    if(y %2 !=0)
		    {
		        int z=arr[a][b];
		        if(z%2 !=0)
		        {
		        while(z > 0)
		        {
		            int rem1=z%10;
		            sum2=sum2+rem1;
		            z=z/10;
		            
		        }
		        }
		        
		    }
		  
		}
		    
		}
		if(c1==1)
		System.out.print(sum1);
		else
		System.out.print(sum2);
	}
}

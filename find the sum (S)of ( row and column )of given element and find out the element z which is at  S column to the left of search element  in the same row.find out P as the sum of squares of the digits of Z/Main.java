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
	int su=0,r=0,c=0,col=n;
	int arr[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        arr[i][j]=s.nextInt();
	    }
	}
		int x=s.nextInt();
	System.out.println(Arrays.deepToString(arr));
	for(int a=0;a<n;a++)
	{
	    for(int b=0;b<n;b++)
	    {
	        if(arr[a][b]==x)
	        {
	             su=a+b;//3
	             r=a;//0
	             c=b;//1
	        }
	    }
	}
	System.out.println("sum : "+su);
		System.out.println("col : "+c+" "+"row : "+r);
	    int n1=0;
	     while(n1<su)
	    {
	        if(c>0)
	        {
	          c--;
	        }
	        else if(c<=0)
	        {
	            col--;
	            c=col;
	        }
	        else
	        {
	            
	        }
	        n1++;
	    }
	    System.out.println("n1 :"+n1+"row :"+r+" "+"col :"+c);
	    System.out.println(arr[r][c]);
	    int y=arr[r][c];
	    int sq=0;
	    while(y > 0)
	    {
	        int rem=y%10;
	        sq=sq+rem*rem;
	        y=y/10;
	    }
	    System.out.println(sq);
	
	
	}
}

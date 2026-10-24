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
		int c=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		    int x=arr[j];
		    int y=x/2;
		    for(int m=1;m<y;m++)
		    {
		        int cub=m*m*m;
		        if(cub==x)
		        {
		            c++;
		            break;
		        }
		    }
		}
		System.out.println(c);
	}
}


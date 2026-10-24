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
	int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr.length;j++)
		    {
		      c[i][j]=0;
		        for(int k=0;k<arr.length;k++)
		        {
		            c[i][j]=c[i][j]+arr[i][k]*arr1[k][j];
		        }
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

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
	//	int arr[]={44,9,23,50,8,10,90,110};// 9 44 23 50 8
			int arr[]={12,89,34, 70,2,56,105,500};
		for(int i=0;i<arr.length;i++)
		{
		    	 //44
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[j]<arr[i]) //9 <44
		        {
		           int temp=arr[i]; //44 9
		            arr[i]=arr[j]; //9  8
		            arr[j]=temp;//44 9
		            
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}

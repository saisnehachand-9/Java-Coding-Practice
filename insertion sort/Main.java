/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*************       INSERTION SORT ******************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={12,4,56,3,89,67,100,43,29};
		for(int i=1;i<arr.length;i++)
		{
		    int temp=arr[i]; //4
		    int j=i-1; //0
		    while(j>=0 && arr[j] > temp)
		    {
		        arr[j+1]=arr[j];
		        j-- ;//-1
		    }
		    arr[j+1]=temp;
		    
		}
		System.out.println(Arrays.toString(arr));
		
	}
}


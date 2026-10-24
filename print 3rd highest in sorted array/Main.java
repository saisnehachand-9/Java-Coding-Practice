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
		 if(n <=200){
		for(int k=0;k<n;k++)
		{
		    arr[k]=s.nextInt();
		}
		}
		for(int i=0;i<n;i++)   // 5 4 3 2  1    1 2 3 4 5 8 9 10
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[i]>arr[j])
		        {
		            int temp=arr[j]; //4
		            arr[j]=arr[i];   //5
		            arr[i]=temp;    //4
		        }
		    }
		}
		 System.out.println(Arrays.toString(arr));
		 System.out.println(arr[n-3]);
	}
}

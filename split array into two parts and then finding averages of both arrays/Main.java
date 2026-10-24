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
		int c=0,s1=0,s2=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		int mid=(n-1)/2; //2
		int high=n-mid-1;//2
		int arr1[]=new int[mid+1]; //3     1 2 3 4 5
		for(int j=0;j<mid+1;j++)
		{
		    arr1[j]=arr[j];
		    c++;
		}
		int arr2[]=new int[high];
		for(int k=0;k<high;k++)
		{
		    arr2[k]=arr[c];
		    c++;
		}
		System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			for(int l=0;l<arr1.length;l++)
			{
			    s1=s1+arr1[l];
			}
			for(int m=0;m<arr2.length;m++)
			{
			    s2=s2+arr2[m];
			}
			System.out.println("s1: "+s1+" "+"s2: "+s2);
			int avg1=s1/arr1.length;
			int avg2=s2/arr2.length;
			System.out.println("avg1:"+avg1);
				System.out.println("avg2:"+avg2);
				if(avg1==avg2)
				     System.out.println("averages are equal");
				     else
				       System.out.println("averages are not equal");
			}
}

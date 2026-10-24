
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
		System.out.println("Even numbers are !!");
		for(int j=0;j<arr.length;j++)
		{
		    if(j%2==0)
		    System.out.print(arr[j]+" ");
		}
		System.out.println("Odd numbers are !!");
		for(int j=0;j<arr.length;j++)
		{
		    if(j%2!=0)
		    System.out.print(arr[j]+" ");
		}
	}
}

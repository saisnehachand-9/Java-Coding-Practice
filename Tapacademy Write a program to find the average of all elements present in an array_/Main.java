
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
		double sum=0;
		for(int j=arr.length-1;j>=0;j--)
		{
		   sum=sum+arr[j];
		}
		System.out.println(sum/arr.length);
	}
}

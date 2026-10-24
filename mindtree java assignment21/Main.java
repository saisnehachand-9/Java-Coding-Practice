
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int arr[]=new int[n];
		int revarr[]=new int[n];
			for(int i=0;i<n;i++)
			{
			    arr[i]=s.nextInt();
			}
			int j=0;
			for(int i=arr.length-1;i>=0;i--)
			{
			    revarr[j]=arr[i];
			    j++;
			}
			System.out.println("Reverse order of array is : "+Arrays.toString(revarr));
	}
}

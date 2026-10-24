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
		
		for(int i=0;i<n;i++) //8 10 4 2 11 
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[j]<arr[i])
		        {
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
	
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		int revArray[]=new int[n];
		int j=0;
		System.out.println(Arrays.toString(arr));
		for(int i=n-1;i>=0;i--)
		{
		    if(j<n){
		    revArray[j]=arr[i];
		    //	System.out.println(revArray[j]);
		    	j++;
		    }
		}
		System.out.println(Arrays.toString(revArray));
	}
}

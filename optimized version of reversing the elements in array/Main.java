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
		int j=n-1;
		int i=0;
		System.out.println(Arrays.toString(arr));
	     while(i<j){
		       int temp=arr[i];
		       arr[i]=arr[j];
		       arr[j]=temp;
		    	//System.out.println("elements are : " +"arr[i] :"+arr[i]+" arr[j] :"+arr[j]+" i : "+i+" j : "+j);
	           j--;
	           i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}

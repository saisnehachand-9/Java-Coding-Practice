import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();  /// 1 2 4 6 8 10
	    }
	    int firstLargeEven=Integer.MIN_VALUE;
	    int secondLargeEven=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++)
	    {
	        int rem=arr[i]%2;
	        if((rem==0) && (arr[i] >firstLargeEven) )
	        { 
	            secondLargeEven=firstLargeEven;//2
	            firstLargeEven=arr[i]; //4
	        }
	            else if(((arr[i]%2==0) && arr[i]<firstLargeEven) && ((arr[i]%2==0) && arr[i]>secondLargeEven) )
	                secondLargeEven=arr[i];
	            
	    }
	    if(secondLargeEven==Integer.MIN_VALUE)
		   System.out.println("not found");
		   else
		    System.out.println(secondLargeEven);
	}
}

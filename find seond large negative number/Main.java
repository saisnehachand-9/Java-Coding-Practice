import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in); // -9 -8 6 7 2 1 // 10 20 1 2
	       int n=s.nextInt();
	       int arr[]=new int[n];
	         for(int i=0;i<n;i++)
	         {
	             arr[i]=s.nextInt();
	         }
		System.out.println(Arrays.toString(arr));
			int largeNegative=Integer.MIN_VALUE;  //  -9 -8 6 7 2 1 -5 
		int secondlargeNegative=Integer.MIN_VALUE; //-8 
			for(int i=0;i<n;i++)
		{
		     if(arr[i]<0){
		    if(arr[i]>largeNegative){
		           secondlargeNegative=largeNegative;//min -9
		           largeNegative=arr[i];//-9 -8 -5
		     }
		        else if(arr[i] >largeNegative && arr[i]<secondlargeNegative)
		        secondlargeNegative=arr[i]; //-8
		     }
		}
		if(secondlargeNegative==Integer.MIN_VALUE)
		    System.out.println("not found");
		else
	      	System.out.println(secondlargeNegative);
	}
}

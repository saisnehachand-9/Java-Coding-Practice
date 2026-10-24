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
			int smallPositive=Integer.MAX_VALUE;  //  -9 -8 6 7 2 1  
		int secondsmallPositive=Integer.MAX_VALUE; //-8 
			for(int i=0;i<n;i++)
		{
		     if(arr[i]>0){
		    if(arr[i]<smallPositive ){
		           secondsmallPositive=smallPositive;
		           smallPositive=arr[i];
		     }
		        else if(arr[i] >smallPositive && arr[i]<secondsmallPositive)
		        secondsmallPositive=arr[i]; //7
		     }
		}
		System.out.println(secondsmallPositive);
	}
}

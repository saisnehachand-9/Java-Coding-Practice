import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		
		int arr[]={10,50,20,90,70,60,70,85};
		 
		
		int firstLargest=arr[0]; /// 50
		int secondLargest=Integer.MIN_VALUE; // 10
	
		 for(int i=1;i<arr.length;i++)
		 {
		   
		   if(arr[i]>firstLargest)
		   {
		       int temp=firstLargest; // 10
		       firstLargest=arr[i]; //50
		       secondLargest=temp;  //10
		   }
		   else
		   {
		       if(arr[i]>secondLargest)
		       {
		           secondLargest=arr[i];
		       }
		       
		   }
		   
		   
		 }

		System.out.println(secondLargest);
	}
}

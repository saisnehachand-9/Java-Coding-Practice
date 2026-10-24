import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
	
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();   // 1 1 2 2 3 3 3 5 6
	    }
	    
	    Arrays.sort(arr);
	    int c=1;//2 1 2 1 3 1
	    System.out.println("Unique elements are : ");
	    for(int i=0;i<n-1;i++)
	    {
	        if(arr[i]==arr[i+1])
	        {
	           c++; 
	        }
	        else
	        {
	            if(c==1)
	               System.out.println(arr[i]);
	           c=1;    
	        }
	    }
	    if(c==1)
	               System.out.println(arr[n-1]);
	               
	                 System.out.println("Duplicate  elements are : ");
	                 
	                 int c1=1;
	                 for(int i=0;i<n-1;i++)       //  // 1 1 2 2 3 3 3 5 6 6
	                 {
	                     if(arr[i+1]==arr[i])
	                     {
	                         c1++;
	                     }
	                     else{
	                         if(c1>1)
	                         {
	                             System.out.println(arr[i]);
	                             c1=1;    
	                         }
	                     }
	                 }
	                  if(c1>1)
	               System.out.println(arr[n-1]);
	}
}

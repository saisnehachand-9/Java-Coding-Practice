import java.util.*;
class Main{
	public static void main(String[] args) {
	    
	    int arr[]={1,2,2,3,3,4,5};
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++)
	    {
	        int c=1;
	        for(int j=i+1;j<arr.length;j++)
	        {
	           if(arr[i]==arr[j])
	              c++;
	        }
	        if(c==1)
	          System.out.print(arr[i]+" ");
	    }
	    
		
	}
}

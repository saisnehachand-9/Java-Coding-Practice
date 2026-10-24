
import java.util.*;

public class Main // 1 2 3 4 5 6 7 
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int m=s.nextInt();
	    int arr2[]=new int[m];
	    for(int i=0;i<m;i++)
	    {
	        arr2[i]=s.nextInt();
	    }
	   int newarr[]=new int[m+n];
	   //ACtual CODE
    int i=0,j=0,k=0;
    while(i<arr.length && j<arr2.length)
    {
        if(arr[i]<=arr2[j]){
          newarr[k]=arr[i];
          k++;
          i++;
         }
        else{
        newarr[k]=arr[i];
          k++;
          i++;
         }
    }
    while(i<arr.length)
    {
        newarr[k]=arr[i];
          k++;
          i++;
    }
	   while(j<arr2.length)
    {
        newarr[k]=arr[j];
          k++;
          j++;
    } 
    System.out.println(Arrays.toString(arr2));
	}
}

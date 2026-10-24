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
	   
	  //  int newarr[]=new int[n];
	    int index=0;
	    for(int j=0;j<n;j++)
	    {
	        if(arr[j]!=0){
	          arr[index]=arr[j];
	          index++;
	        }
	    }
	        for(int k=index;k<n;k++)
	        {
	            arr[k]=0;
	        }
	    System.out.println(Arrays.toString(arr));
	}
}

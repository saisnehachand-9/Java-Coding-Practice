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
	    HashSet<Integer> set=new HashSet<Integer>();
	    //Boolean found=false;
	    for(int i=0;i<n;i++)
	    {
	         int j=arr[i];
	         if(set.contains(j)){
	               System.out.println("duplicates found");
	              // found=true;
	               return;
	           }
	           else{
	               set.add(j);
	           }
	    }
	   // if(!found)
		System.out.println("no duplicates found");
	}
}

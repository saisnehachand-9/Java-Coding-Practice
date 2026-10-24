import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    HashSet<Integer> set=new HashSet<Integer>();
	     int n=s.nextInt();
	    int arr[]=new int[n];
	   
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++)
		{
		    set.add(arr[i]);
		}
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
		    int j=it.next();
		   if((j % 2==0)
		      it.remove();
		}
	System.out.println(set);
	}
}

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
	    HashMap<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<n;i++)
	    {
	        int x=arr[i]; //1
	        map.put(x,map.getOrDefault(x,0)+1);
	    }
		System.out.println(map);
		int large=1;
		int element=arr[0];
		for(int i=0;i<n;i++)
		{
		    int val=map.get(arr[i]);
		    if(val>=large)
		    {
		        large=val;
		        element=arr[i];
		    }
		    	//System.out.println("element : "+element);
		}
			System.out.println("element : "+element);
	}
}

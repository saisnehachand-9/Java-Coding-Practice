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
	        map.put(arr[i],(map.getOrDefault(arr[i],0))+1);
	    }
		System.out.println(map);
		for(Integer key:map.keySet())
		{
		   	System.out.println(key+": "+map.get(key)+" "); 
		}
		
	}
}

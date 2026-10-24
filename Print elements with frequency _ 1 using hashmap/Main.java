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
		    if(map.get(key)>1)
		   	System.out.println(key+": "+map.get(key)+" "); 
		}
		// or you can use entry set as it gives both key and value
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
		    if(entry.getValue()>1)
		      System.out.println(" key : "+entry.getKey()+" value : "+entry.getValue());
		}
	}
}

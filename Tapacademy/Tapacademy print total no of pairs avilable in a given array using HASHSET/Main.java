import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();   //mississippi
	   int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	          arr[i]=s.nextInt();
	    }
		    	System.out.println(Arrays.toString(arr));
		    	LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();

		    	for(int i=0;i<arr.length;i++)
		    	{
		    	    if(!map.containsKey(arr[i]))
		    	      map.put(arr[i],1);
		    	      else
		    	      {
		                  int val=map.get(arr[i]);
		                  map.put(arr[i],val+1);
		    	      }
		    	}

		    System.out.println(map);
		    int c=0;
		    for(Integer keys:map.keySet())
		    {
		        int val=map.get(keys);
		         System.out.println(keys +" pairs : "+val/2);
		         int x=val/2;
		         c=c+x;
		    }
		    System.out.println(" Totaal pairs : "+c);
	}
}

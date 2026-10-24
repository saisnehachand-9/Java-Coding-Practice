import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();   // 2 5 1 4 3 4 1 5 1 3 ,  o/p=> 1 has occured 3 times
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
		   int Key=0;int max=0;
		   for(Integer key:map.keySet())
		   {
		       int val=map.get(key);
		       if(val > max)
		         {
		             Key=key;
		             max=val;
		          }
		   }
		    System.out.println(" Maximum pairs  => "+Key+" : "+max);
	}
}

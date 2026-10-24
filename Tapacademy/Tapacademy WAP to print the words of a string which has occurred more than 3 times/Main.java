import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
String s1=s.nextLine();//i/p: fear leads to anger anger leads to hatred hatred leads to conflicts and conflicts leads to sufferings
	   int c=1;        //o/p:  leads ,to (because leads and to occured 4 times)
	   for(int i=0;i<s1.length()-1;i++)
	   {
	       if(s1.charAt(i)!=' ' && s1.charAt(i+1)==' ')
	          c++;
	   }
	  String arr[]=new String[c];
	  String sub="";
	  int k=0;
	  for(int i=0;i<s1.length();i++)
	  {
	      if(s1.charAt(i)!=' ')
	        sub=sub+s1.charAt(i);
	        else
	        {
	            if(sub.length()>0)
	                  {
	                      arr[k]=sub;
	                      k++;
	                      sub="";
	                  }
	        }
	  }
	  arr[k]=sub;
		    	System.out.println(Arrays.toString(arr));
		    		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();

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

		    System.out.println("map is "+map);
		    
		  for(String key:map.keySet())
		    {
		        int val=map.get(key);
		        if(val > 3)
		           System.out.println(key);
		    }
	}
}

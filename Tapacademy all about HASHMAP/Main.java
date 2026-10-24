import java.util.*;
public class Main
{
	public static void main(String[] args) { // b s c i l f d
	  HashMap<String,Integer> map=new HashMap<String,Integer>();
	  map.put("India",100);
	  map.put("Iran",200);
	  map.put("America",100);
	  map.put("Argentina",300);
	  map.put("Antartica",500);
	  map.put("Nepal",400);
	  map.put("Japan",300);
	  map.put("Korea",200);
	  	System.out.println(map);
	  	map.remove("Argentina") ; // we should only pass the key in remove()
	    System.out.println("After removing Argentina :"+map);
	    
	    //Inorder to get keys,as keys are unique so we are storing in a SET
	    Set<String> keys=map.keySet();  //keySet() will give you all the keys
	    
	    
	     System.out.println("printing keys");
	    System.out.println(keys);
	    System.out.println("we can also print keys which are stored in HASHSET using for-each loop");
	    for(String k:keys)
	    {
	        System.out.println(k);
	    }
	      System.out.println("we can also print keys using for-each loop by calling MAP.KEYSET())");
	    for(String k1:map.keySet())
	    {
	        System.out.println(k1);
	    }
	    System.out.println("printing values");
	    System.out.println(map.values());
	     System.out.println("we can also print values using for-each loop");
	     for(Integer i:map.values())
	    {
	        System.out.println(i);
	    }
	    System.out.println("printing entries(key,values)");
	    for(String k:map.keySet())
	    {
	        System.out.println(k+" : "+map.get(k));
	    }
	   
	  //If we make the map as LINKEDHASHMAP ,it will give the o/p in INSERTING order
	  //If we make the map as TreeMAP ,it will give the o/p in SORTING order
	}
}

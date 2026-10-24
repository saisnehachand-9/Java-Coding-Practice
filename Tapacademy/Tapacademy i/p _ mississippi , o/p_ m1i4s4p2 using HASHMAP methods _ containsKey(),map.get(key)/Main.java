import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();   //mississippi
	    LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	    for(int i=0;i<s1.length();i++)
	    {
	        
	        if(!map.containsKey(s1.charAt(i)))
	            map.put(s1.charAt(i),1);
	            else{
	                int val=map.get(s1.charAt(i));
	                map.put(s1.charAt(i),val+1);
	            }
	            
	    }
		System.out.println(map);
		
		for(Character c:map.keySet())
		{
		    	System.out.println(c+" : "+map.get(c));
		}
	   Set<Character> se=map.keySet();
			for(Character c:se)
		{
		    	System.out.print(c+""+map.get(c));
		}
	}
}

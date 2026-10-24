import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	     String s1=s.nextLine();//aabbbccd
	     LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	   // LinkedHashSet<Character> set=new LinkedHashSet<>();
	     for(int i=0;i<s1.length();i++)
	     {
	         char c=s1.charAt(i);
	         map.put(c,map.getOrDefault(c,0)+1);
	       //  set.add(c);
	     }
	     System.out.println(map);
	    // System.out.println(set);
	    for(Character ch:map.keySet())
	    {
	        if(map.get(ch)==1)
	         {
	             System.out.println(ch);
	             return;
	         }
	    }
	     System.out.println("no non-repeating element found");
	}
}

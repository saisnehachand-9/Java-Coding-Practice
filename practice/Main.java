import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	 String s1=s.nextLine(); //hello master
	    String s2=s.nextLine();
	     s1=s1.replaceAll("\\s","").toLowerCase();// sai
	     s2=s2.replaceAll("\\s","").toLowerCase(); // sai
	       boolean isAnagram=true;
	    if(s1.length()!=s2.length())
	    {
	        System.out.println("not anagrams");
	        return;
	    }
	    else{
	        HashMap<Character,Integer> map=new HashMap();
	        for(int i=0;i<s1.length();i++)
	     {
	         map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
	     }
	      
	     for(int i=0;i<s2.length();i++)
	     {
	         char ch=s2.charAt(i);
	         map.put(ch,map.getOrDefault(ch,0)-1);
	         
	     }
	      
	        for(Integer val:map.values())
	        {
	            if(val !=0)
	            {
	                isAnagram=false;
	                break;
	                
	            }
	        }
	        
	    }
	    System.out.println(isAnagram);
	}
}

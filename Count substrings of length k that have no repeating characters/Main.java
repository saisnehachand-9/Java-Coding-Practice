import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //abcba|bce
	    int k=s.nextInt();
	   
	    if(k>0 && k<=s1.length())
	    {
	        for(int i=0;i<=s1.length()-k;i++)
	        {
	            String substr=s1.substring(i,(i+k));
	             boolean found=false;
	           HashMap<Character,Integer> map=new HashMap<>();
	           for(int j=i;j<substr.length();j++)
	           {
	               map.put(s1.charAt(j),map.getOrDefault(s1.charAt(j),0)+1);
	           }
	           //System.out.println(map);
	           for(Integer val:map.values())
	           {
	               if(val >1){
	                   found=true;
	                   break;
	               }
	           }
	           if(!found)
	             System.out.println(substr);
	        }
	       
	    }
	  
	}
}

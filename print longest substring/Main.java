import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    String longestSubstr="";
	    for(int i=0;i<s1.length();i++) //abcdabcde
	    {
	        String substr="";
	        for(int j=i;j<s1.length();j++)
	        {
	            if(substr.contains(String.valueOf(s1.charAt(j))))
	            {
	              
	                break;
	            }
	            substr=substr+s1.charAt(j);
	            
	        }
	      //  System.out.println(substr);
	       
	            if(substr.length()>longestSubstr.length()){
	              longestSubstr=substr;
	             // System.out.println(longestSubstr);
	            }
	        
	    }
		System.out.println(longestSubstr);
	}
}

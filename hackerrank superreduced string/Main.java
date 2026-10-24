import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1="aaabccddd";
	StringBuilder sb=new StringBuilder(s1);
	for(int i=0;i<sb.length()-1;i++)
	{
	    if(sb.charAt(i)==sb.charAt(i+1))
	    {
	        sb.delete(i,i+2);
	         i=-1;
	        
	    }
	   
	}
	     if(sb.length()==0)
	        System.out.println(" empty string");
	        else 
	         System.out.println(sb.toString());
	   
	     
	}
}

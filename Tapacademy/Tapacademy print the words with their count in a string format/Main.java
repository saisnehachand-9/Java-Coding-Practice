import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();   // hello world  ,   o/p=> hello5 world4
	    String sub="";
	   // String rev="";
	    String mainsub="";
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)!=' ')
	        {
	            sub=sub+s1.charAt(i);
	        }
	        else
	        {
	            mainsub=mainsub+sub+sub.length()+" ";
	            sub="";
	        }
	    }
	            mainsub=mainsub+sub+sub.length();
		System.out.println(mainsub);
	}
}

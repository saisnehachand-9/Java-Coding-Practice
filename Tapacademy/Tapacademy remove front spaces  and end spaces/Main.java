import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();    // i/p:       Hello   world          o/p-Hello       world
	    String res="";
	    int start=0;
	    int end=s1.length()-1;
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)!=' ')
	        {
	            start=i;
	            break;
	        }
	    }
	    for(int i=s1.length()-1;i>=0;i--)
	    {
	        if(s1.charAt(i)!=' ')
	        {
	           end=i;
	            break;
	        }
	    }
	    for(int i=start;i<=end;i++)
	    {
	       res=res+s1.charAt(i);
	    }
		System.out.println(res);
	}
}

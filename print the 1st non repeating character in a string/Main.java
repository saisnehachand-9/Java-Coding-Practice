import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="ssabc";
	    String y="";
	    boolean found=false;
	    for(int i=0;i<str.length();i++)
	    {
	        int c=1;
	        for(int j=i+1;j<str.length();j++)
	        {
	            if(str.charAt(i)==str.charAt(j))
	              c++;
	        }
	        if(c>1)
	             y=y+str.charAt(i);
	        if(c==1 && !y.contains(String.valueOf(str.charAt(i))) )
	        {
	           // y=y+str.charAt(i);
	            System.out.println(str.charAt(i));
	            found=true;
	            break;
	        }
	    }
	    if(!found)
	       System.out.println("not found");
		
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //mississippi
	    String unique="";
	    String res="";
	    for(int i=0;i<s1.length();i++)
	    {
	        if(!unique.contains(String.valueOf(s1.charAt(i))))
	             unique=unique+String.valueOf(s1.charAt(i));
	    }
	    	System.out.println(unique);
	    for(int i=0;i<unique.length();i++)
	    {
	        int c=0;
	        for(int j=0;j<s1.length();j++)
	          {
	        if(unique.charAt(i)==s1.charAt(j))
	           c++;
	            }
	            res=res+unique.charAt(i)+c;
	    }
		System.out.print(res);
	}
}

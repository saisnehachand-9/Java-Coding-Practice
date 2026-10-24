import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.next(); //saisneha
	    String res="";
	  
	    for(int i=0;i<s1.length();i++)
	    {
	          int c=1;
	        for(int j=0;j<s1.length();j++)
	        {
	            if(i!=j && s1.charAt(i)==s1.charAt(j))
	               c++;
	        }
	        if(c==1)
	           res=res+s1.charAt(i);
	    }
		System.out.println(res);
	}
}

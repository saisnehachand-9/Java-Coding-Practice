import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    String sub="";
	    String rev="";
	    String mainrev="";
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)!=' ')
	        {
	            sub=sub+s1.charAt(i);
	        }
	        else
	        {
	            for(int j=sub.length()-1;j>=0;j--)
	            {
	                rev=rev+sub.charAt(j);
	            }
	            mainrev=mainrev+rev+" ";
	            rev="";
	            sub="";
	        }
	    }
	     for(int j=sub.length()-1;j>=0;j--)
	            {
	                rev=rev+sub.charAt(j);
	            }
	            mainrev=mainrev+rev;
		System.out.println(mainrev);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	for(int i=s1.length();i>=1;i--) //malayalam
	{
	  for(int j=0;j<=s1.length()-i;j++)
	  {
	      String sub="";
	      for(int k=j;k<(j+i);k++)
	      {
	         sub=sub+s1.charAt(k);
	      }
	      String rev="";
	      for(int l=sub.length()-1;l>=0;l--)
	      {
	          rev=rev+sub.charAt(l);
	      }
	      if(rev.equals(sub))
	      {

	         	System.out.println(" Palindromic Substrings and its count is : "+rev+" : "+rev.length());
	      }
	      
	  }
	
	}
     
	}
}

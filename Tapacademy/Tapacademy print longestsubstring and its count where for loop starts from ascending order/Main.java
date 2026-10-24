import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	int max=0;
	String longestSubstring="";
	for(int i=1;i<=s1.length();i++) //helloworld
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
	      if(rev.equals(sub) && sub.length()>max)
	      {
	          max=sub.length();
	          longestSubstring=sub;
	      }
	      
	  }
	}
     	System.out.println(" longestSubstring and its count is : "+longestSubstring+" "+max);
	}
}

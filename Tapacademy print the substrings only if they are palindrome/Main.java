import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	int size=s.nextInt();
	for(int i=0;i<=s1.length()-size;i++)
	{
	    String sub="";
	    for(int j=i;j<i+size;j++)
	    {
	       sub=sub+s1.charAt(j);
	       
	    }
	    String rev="";
	    for(int k=sub.length()-1;k>=0;k--)
	    {
	        rev=rev+sub.charAt(k);
	    }
	    if(rev.equals(sub))
	       System.out.println(sub);
	}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();   //mississippi
	    int c=1;
	    for(int i=0;i<s1.length()-1;i++)
	    {
	        if(s1.charAt(i)!=' '&& s1.charAt(i+1)==' ')
	        c++;
	    }
		    	System.out.print(c);
		    	String arr[]=new String[c];
		    	int k=0;
		    	String sub="";
		    	for(int i=0;i<s1.length();i++)
		    	{
		    	    if(s1.charAt(i)!=' ')
		    	      sub=sub+s1.charAt(i);
		    	      else
		    	      {
		    	          if(sub.length()>0)
		    	          {
		    	              arr[k]=sub;
		    	              k++;
		    	              sub="";
		    	          }
		    	      }
		    	}
		    	arr[k]=sub;
		    System.out.println(Arrays.toString(arr));
		    	System.out.println("we can also do uusing hashset directly");
		    		
		    	HashSet<String> set=new HashSet<String>();
		    	String sub1="";
		    	for(int i=0;i<s1.length();i++)
		    	{
		    	    if(s1.charAt(i)!=' ')
		    	      sub1=sub1+s1.charAt(i);
		    	      else
		    	      {
		    	          if(sub1.length()>0)
		    	          {
		    	             set.add(sub1);
		    	              sub1="";
		    	          }
		    	      }
		    	}
		    		System.out.println(set);
		    	 
		    	 
		    	 
//	i/p : fear leads to anger anger leads to hatred hatred leads to conflicts and conflicts leads to sufferings
//  o/p : fear leads conflicts anger to hatred and
	}
}

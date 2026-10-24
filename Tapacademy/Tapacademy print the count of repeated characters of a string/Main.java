import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //missippi;
	   HashSet<Character> set=new HashSet<Character>();
	    for(int i=0;i<s1.length();i++)
	    {
	        set.add(s1.charAt(i));
	    }
	    
		System.out.println(set);
		for(Character c:set)
		{
		    int count=0;
           for(int i=0;i<s1.length();i++)
	         {
	           if(c==s1.charAt(i))
	               count++;
	        }
	        System.out.println("count of "+ c + " : "+count);
		}
	}
}

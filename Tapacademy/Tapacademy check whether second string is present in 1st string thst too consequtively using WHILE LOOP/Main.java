import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();    // i/p:hereiamstackerrank        o/p-hackerrank
	    String s2=s.nextLine();
	    int i=0,j=0;
	          while(i<s1.length() && j<s2.length())
	          {
	              if(s1.charAt(i)==s2.charAt(j))
	              {
	                  i++;
	                  j++;
	              }
	              else{
	                  i++;
	              }
	          }
	   
	    	System.out.println(j);
	   if(j==s2.length())
		System.out.println("true");
		else
			System.out.println("false");  
	}
}

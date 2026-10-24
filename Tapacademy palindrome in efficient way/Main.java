import java.util.*;
public class Main
{
    public static String palindrome(String s1)
    {
         int i=0,j=s1.length()-1;
	    while(i<j){
	      
	      if(s1.charAt(i)==s1.charAt(j))
	        {
	            i++;
	            j--;
	        }
	         else
	         return "not palindrome";
	
	    }
	    return "palindrome";
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.next();
	      System.out.println(palindrome(s1));
	}
}

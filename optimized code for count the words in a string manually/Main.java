import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //      hello world    
	    int count=0; //1
	      boolean wordFound=false; //true
	    for(int i=0;i<s1.length();i++)
	    {
	        char ch=s1.charAt(i); // he
	      //true
	        if(!Character.isWhitespace(ch))
	        {
	            if(!wordFound)
	            {
	                count++; //1
	                wordFound=true;
	            }
	        }
	        else{
	            wordFound=false;
	        }
	    }
		System.out.println("count of words : "+count);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //missippi;
	    int c=1;
	    String unique="";
	    for(int i=0;i<s1.length();i++)
	    {
	        if(!unique.contains(String.valueOf(s1.charAt(i))))
	        {
	            unique=unique+s1.charAt(i);
	        }
	
	    }
	    
		System.out.println(unique);
	}
}

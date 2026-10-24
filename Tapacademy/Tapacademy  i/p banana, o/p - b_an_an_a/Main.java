
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in); // b*an*an*a
		String s1=s.nextLine();
		String res="";
		for(int i=0;i<s1.length();i++)
		{
		    if(s1.charAt(i)=='a' ||s1.charAt(i)=='A' )
		    res=res+"*"+s1.charAt(i);
		    else
		    res=res+s1.charAt(i);
		}
		System.out.println(res);
	}
}

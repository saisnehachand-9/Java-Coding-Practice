import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.next();
	   String res="";
	   for(int i=0;i<s1.length();i++)
	   {
	       char ch=s1.charAt(i);
	       if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
	           res=res+ch;
	   }
		System.out.println(res);
	}
}

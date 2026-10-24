import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.next();  //a+b-(2/3)*p
	   String res1="";
	   String res2="";
	   for(int i=0;i<s1.length();i++)
	   {
	       char ch=s1.charAt(i);
	       if((ch>='a' && ch< ='z')|| (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
	           res1=res1+ch;
	           else
	           res2=res2+ch;
	   }
		System.out.println(res1+res2);
	}
}

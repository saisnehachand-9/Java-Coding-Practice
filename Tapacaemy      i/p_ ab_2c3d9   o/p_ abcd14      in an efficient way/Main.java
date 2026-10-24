import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.next();  //a+b-(2/3)*p
	   String res1="";
	   int intsum=0;
	   for(int i=0;i<s1.length();i++)
	   {
	       char ch=s1.charAt(i);
	       if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') )
	           res1=res1+ch;
	           else if((ch>=48 && ch<=57))  // char '0' will be converted implicitly to 48
	           intsum=intsum+(ch-48);
	   }
		System.out.println(res1+intsum);
	}
}
//i/p ab*2c3d9   o/p abcd14
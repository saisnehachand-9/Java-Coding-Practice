
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in); // b*an*an*a
		String s1=s.nextLine(); //HeLLo   => H#LL#
		String res="";
		int p=0;
		for(int i=0;i<s1.length();i++)
		{
		   for(char ch='a';ch<='z';ch++){
		       if(s1.charAt(i)==ch)
		         p=1;
		       }
		       if(p==1){
		         res=res+"#";
		         p=0;
		       }
		         else{
		             res=res+s1.charAt(i);
		         }
		       
		}
		System.out.println(res);
	}
}

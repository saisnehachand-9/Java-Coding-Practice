import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.next();
	    int vc=0,cc=0,nc=0,sc=0;
	    for(int i=0;i<s1.length();i++)
	    {
	        char ch=s1.charAt(i);
	        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	        {
	            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	               vc++;
	               else
	               cc++;
	        }
	        else if(ch>='0' && ch<='9')
	            nc++;
	            else
	            sc++;
	    }
		System.out.println("Vowels count : "+vc);
		System.out.println("Consonant  count : "+cc);
		System.out.println("Numeric  count : "+nc);
		System.out.println("Special Charcaters count : "+sc);
	}
}

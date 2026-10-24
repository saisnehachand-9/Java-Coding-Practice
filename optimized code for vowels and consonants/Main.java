import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine();
	    int vowels=0;
	    int consonants=0;
	    for(int i=0;i<s1.length();i++)
	    {
	        char ch=s1.charAt(i);
	        if(Character.isLetter(ch) )
	        {
	            String s2="aeiouAEIOU";
	            if(s2.indexOf(ch)!=-1)
	                 vowels++;
	                 else
	                 consonants++;
	        }
	    }
		System.out.println(vowels+" "+consonants);
	}
}

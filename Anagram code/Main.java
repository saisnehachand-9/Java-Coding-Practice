import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s1=s.nextLine(); //hello master
	    String s2=s.nextLine();
	     s1=s1.replaceAll("\\s","").toLowerCase();
	     s2=s2.replaceAll("\\s","").toLowerCase();
	    if(s1.length()!=s2.length())
	    {
	        System.out.println("not anagrams");
	        return;
	    }
	    else{
	        char arr1[]=s1.toCharArray();
	        char arr2[]=s2.toCharArray();
	        Arrays.sort(arr1); // e h  l l o
	        Arrays.sort(arr2);//  d e h l o
	        if(Arrays.equals(arr1, arr2))
	           	System.out.println("Anagrams");
	           	else
	           		System.out.println("Not Anagrams");
	    }
		//System.out.println("Hello World");
	}
}

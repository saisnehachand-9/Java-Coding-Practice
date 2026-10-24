import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String s2=s.nextLine();   // hello      world      sai ,   o/p=> [hello,world,sai]
	    String s1=s2.trim();
	    String sub="";
	    String mainsub="";
	    int c=1;
	    for(int i=0;i<s1.length()-1;i++)
	    {
	        if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
	        {
	           c++;
	        }

	    }
	    	System.out.println("count of words : "+c);
	    String arr[]=new String[c];
	    int k=0;
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)!=' ')
	        {
	            sub=sub+s1.charAt(i);
	        }
	        else{
	            if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' '){
	            arr[k]=sub;
	            sub="";
	            k++;
	            }
	        }
	    }
	    arr[k]=sub;
		System.out.println(Arrays.toString(arr));
	}
}

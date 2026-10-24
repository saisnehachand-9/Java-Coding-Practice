import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter lowercase letters");
	    String s1=s.nextLine(); //aebcd
	    String res1="";
	    String res2="";
	    for(int i=0;i<s1.length();i++)
	    {
	        char ch=s1.charAt(i); //a 
	        int j=ch-32;
	        char c=(char)j;
	        res1=res1+c;
	        
	    }
	System.out.println("coverting to upper : " +res1);
		System.out.println("Enter UPPER CASE LETTERS
		
		
		
		: ");
	 String s2=s.nextLine();  //ABC
	 for(int i=0;i<s2.length();i++)
	 {
	     char ch=s2.charAt(i);// A 
	     int j=ch+32; //97
	     char c=(char)j;
	     res2+=c;
	 }
	System.out.println("coverting to upper : "+res2);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	for(int i=0;i<=s1.length()-4;i++)
	{
	    String sub="";
	    for(int j=i;j<(i+4);j++)
	    {
	       sub=sub+s1.charAt(j); 
	    }
	    System.out.println(sub);
	}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	for(int i=1;i<=s1.length();i++) //helloworld
	{
	  for(int j=0;j<=s1.length()-i;j++)
	  {
	      String sub="";
	      for(int k=j;k<(j+i);k++)
	      {
	         sub=sub+s1.charAt(k);
	      }
	      	System.out.println(sub);
	  }
	}

	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	for(int j=1;j<=4;j++){
	for(int i=0;i<=s1.length()-j;i++)
	{
	    String sub="";
	    for(int k=i;k<(i+j);k++)
	    {
	       sub=sub+s1.charAt(k); 
	    }
	    System.out.println(sub);
	}
	}
	
	
	 System.out.println("You will also get the sam o/p if u try the below code!!!");

	for(int i=0;i<=s1.length()-4;i++)
	{
	    String sub="";
	    for(int k=i;k<(i+4);k++)
	    {
	       sub=sub+s1.charAt(k);
	        System.out.println(sub);
	    }
	   
	}


	}
}




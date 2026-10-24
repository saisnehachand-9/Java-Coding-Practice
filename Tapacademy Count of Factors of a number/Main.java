
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c=0;
	    for(int i=1;i<=n;i++)
	    {
	        if(n% i==0)
	        c++;
	    }
	System.out.println("Count of factors of a number "+n+" is : "+c);
	}
}

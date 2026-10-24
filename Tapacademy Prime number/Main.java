
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int c=0;
	    for(int i=2;i<=n/2;i++)
	    {
	        if(n% i==0)
	        c++;
	    }
	    if(c==0)
	System.out.println("It is a prime number");
	else
	System.out.println("No is a prime number");
	}
}

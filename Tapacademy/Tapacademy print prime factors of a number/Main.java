import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt(); //24  -> 2 2 2 3
	    for(int i=2;i<n;i++)
	    {
	        while(n % i == 0)
	        {
	           	System.out.println(i);
	           	n=n/i;
	           	
	        }
	    }
	    if(n>1)
	      System.out.println(n);
	}
}

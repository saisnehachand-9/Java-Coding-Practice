
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	                       // 10   ->  1  2    5  10
	                       // 20   ->  1  2  4 5  10 20
	    
	     int n=s.nextInt();
	     int m=s.nextInt();
	      int c=0;
	      int x;
	      if(n<m)
	        x=n;
	        else
	        x=m;
	    for(int i=x;i>=1;i--)
	    {
	        if(n% i==0 && m%i==0)
	          {
	        	System.out.println(i);
	        	break;
	          }
	        
	    }
	  
	}
}

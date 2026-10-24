
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    	System.out.println("enter count");
	    	  int n=s.nextInt();
	    	  for(int j=0;j<n;j++){
	    	      	System.out.println("enter a num");
	    int a=s.nextInt();//5
	    int c=0;
	    for(int i=1;i<=a;i++)
	    {
	        if(a%i==0)
	         c++;
	    }
	     if(c==2)
		System.out.println("prime num");
		else 
		System.out.println("not a prime num");
	    	  }
	}
}

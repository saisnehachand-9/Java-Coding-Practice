
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	                       // 3   ->  3 6 9 12 15 18 21 24 27 30 
	                       // 4   ->  4 8 12 16 20 24 28 32 36 40
	    
	      int x=s.nextInt();
	     int n=s.nextInt();
	     int m=s.nextInt();
	     int c=0;
	     int i=1;
	     while(c<x)
	     {
	         int a=m*i;
	         if(a%n==0 && a%m==0)
	         {
	             System.out.print(a+" ");
	             c++;
	         }
	         i++;
	     }
	  
	}
}

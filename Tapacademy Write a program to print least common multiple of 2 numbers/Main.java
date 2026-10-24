
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	                       // 3   ->  3 6 9 12 15 18 21 24 27 30 
	                       // 4   ->  4 8 12 16 20 24 28 32 36 40
	   
	     int n=s.nextInt();
	     int m=s.nextInt();
           int i=1;
	  
	      while(i>=1){
	         int a=m*i; //3 6 9 12
	         if(a%n==0 && a%m==0)
	         {
	             System.out.print(a+" ");
	             break;
	         }
	         i++;
	      }
	     
	  
	}
}

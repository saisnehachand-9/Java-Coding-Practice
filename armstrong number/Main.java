import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    String s1=String.valueOf(n);
	    int l=s1.length(); //153
	    int sum=0;
	    if(n<0)
	    {
	        System.out.println("Not an Armstrong Number");
	        return;
	    }
	    while(n>0)
	    {
	        int rem=n%10; // 3 
	        n=n/10;
	        int j=0;
	        int sum1=1;
	        while(j<l)
	        {
	            sum1=sum1*rem;
	            j++;
	        }
	        sum=sum+sum1;
	    }
	    // System.out.println(sum);
	   if(sum==temp)
	     System.out.println("Armstrong Number");
	    else 
	       System.out.println("Not an Armstrong Number");
	}
}

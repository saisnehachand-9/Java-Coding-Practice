import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt(); //200
	    if(n==0)
	      System.out.println("0 is a armstrong number");
	      if(n<0)
	      {
	           System.out.println("numbers < 0 has no armstrong numbers");
	           return;
	      }
	    for(int i=1;i<=200;i++)
	    {
	        int num=i;
	        int temp=i;
	        int length=String.valueOf(num).length(); // 153
	        int sum=0;
	        while(num>0)
	        {
	            int rem=num%10;
	            num=num/10;
	            int product=1;
	            for(int j=0;j<length;j++)
	            {
	                product=product*rem;
	            }
	            sum=sum+product;
	        }
	        if(sum==temp)
	          System.out.println(i+" is a armstrong number");
	    }
	    
		//System.out.println("Hello World");
	}
}

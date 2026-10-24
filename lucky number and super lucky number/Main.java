/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int x=4444;
	
		int temp=x;
		int c=0,c1=0,c2=0;
		while(temp > 0)
		{
		    int rem=temp% 10;
		    if(rem==7 || rem ==4)
		    {
		        c++;
		    }
                 temp=temp/10;
		        }
		if(c==String.valueOf(x).length())
		{
		   temp=x;
		    System.out.println("lucky number");
		    while(temp > 0)
		    {
		        int rem1=temp % 10;
		        if(rem1 == 7)
		              c1++;
		              if(rem1==4)
		                  c2++;
		          temp=temp/10;        
		    }
		    	System.out.println("length is"+String.valueOf(x).length());
		    		System.out.println("c1 is"+c1);
		    			System.out.println("c2 is"+c2);
		    if(c1== 7 || c1== 4 || c2== 7 || c2== 4 || String.valueOf(x).length()==7 || String.valueOf(x).length()==4)
		    {
		         System.out.println(" Super Lucky Number");
		         temp=x;
		         System.out.println("temp :"+temp);
		         String rev="";
		         while(temp > 0)
		         {
		             int rem2=temp%10;;
		             rev=rev+String.valueOf(rem2);
		         }
		         System.out.println(rev);
		         if(rev.equals(String.valueOf(x)))
		             System.out.println(" Super Lucky Palindrome Number");
		             else
		             System.out.println(" Not a Super Lucky Palindrome  Number");
		    }
		         else
		          System.out.println(" Not a Super Lucky Number");
		    
		}
		         else
		          System.out.println("Not a lucky number");
	}
}


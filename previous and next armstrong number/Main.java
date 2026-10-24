/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static int armstrong(int x)
    {
        int sum=0;
        while(x > 0)
        {
            int rem=x % 10;
            sum=sum+rem*rem*rem;
            x=x/10;
        }
        return sum;
            
    }
    
	public static void main(String[] args) {
	int c=0,c1=0,n1=100;
	int temp1=n1-1;
	int temp2=n1+1;
	while(temp1>0)
	{
	    int arm1=armstrong(temp1);
	    if(arm1==temp1)
	    {
	        c++;
	        if(c==1)
	        {
	            System.out.println(arm1+" ");
	          //  break;
	           
	        }
	        
	    }
	     temp1--;
		
	}
	while(temp2>0 )
	{
	    int arm2=armstrong(temp2);
	    if(arm2==temp2)
	    {
	        c1++;
	        if(c1==1)
	        {
	            System.out.print(arm2+" ");
	            //break;
	           
	        }
	        
	    }
	     temp2++;
		
	}
	}
}



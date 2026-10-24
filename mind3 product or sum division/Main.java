/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int numdivis(int[] arr)
    {
       
       int c=0;
        for(int j=0;j<arr.length;j++)
        {
             int sum=0,product=1;
            int x=arr[j];
            while(x>0)
            {
                int rem=x % 10;
                sum=sum+rem;
                product=product*rem;
                x=x/10;
            }
            if(product !=0 && sum>=0)
            {
            if((arr[j] % sum==0) || (arr[j] % product==0) )
            c++;
            }
            
           
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int  arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		    }
		    int result=numdivis(arr);
		    System.out.println(result);
	}
}


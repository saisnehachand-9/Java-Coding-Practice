/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int getdecreasing(int N)
    {
          	int count=0;
		for(int i=0;i<=N;i++)
		{
		    int c=0;
		   String x=String.valueOf(i);//531
		   int l=x.length();
		   for(int j=0;j<x.length();j++)
		   {
		       if((j+1)<l)
		       {
		           if((Character.getNumericValue(x.charAt(j+1)))<=(Character.getNumericValue(x.charAt(j))))
		                 c++;
		           
		       }
		   }
		   if(c==x.length()-1)
		   {
		      count++;
		   }
		    
		}  
		return count;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int result;
		result=getdecreasing(n);
		System.out.println(result);
	
	
	}
}


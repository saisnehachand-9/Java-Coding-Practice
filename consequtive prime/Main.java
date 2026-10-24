/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();//20
	    int c1=0;
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int i=2;i<n;i++)
	    {
	         int c=0;
	        for(int j=1;j<=i;j++)
	        {
	            if(i % j == 0)
	               c++;
	        }
	        if(c==2)
	         list.add(i);
	    }
	    System.out.println(list);
	    int sum=0;
	  for(int k=0;k<list.size();k++)
	  {
	     sum=sum+list.get(k);
	     if(sum >=3)
	     {
	     if(list.contains(sum))
	     {
	     System.out.println(sum);
	         c1++;
	     }
	    }
	  }
	System.out.println("count :"+c1);
	}
}

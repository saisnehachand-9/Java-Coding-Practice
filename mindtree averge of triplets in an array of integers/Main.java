/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int count(int arr[])  // 1 2 3 4 5 
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int c=0,c1=0,sum=arr[i];
            int j=i+1;
            while(c<2)
            {
                if((j)<arr.length)
                    {
                        sum=sum+arr[j];
                        c1++;
                    }
                    j++;
                    c++;
            }
            if(c1==2)
                 {
                     int div=sum%3;
                     if(div==0)
                          count++;
                 }
        }
        return count;
        
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int Arr[]=new int[n];
	for(int l=0;l<n;l++)
	{
	    Arr[l]=s.nextInt();
	}
	System.out.println(count(Arr));
	}
}



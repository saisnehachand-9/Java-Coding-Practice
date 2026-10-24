/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static long isarmstrong(long y)
    {
        long cub=0;
       long temp=y;
        while(y>0)
        {
            long rem=y % 10;
            cub=cub+rem*rem*rem;
            y=y/10;
        }
        if(cub==temp)
             {
                long even=0;
                while(temp>0)  // 153
                {
                   long rem=temp % 10;
                    if(rem % 2 ==0)
                    {
                         even=even+rem;
                    }
                    temp=temp/10;
                }
                return even;
             }
             else
             {
                 long odd=0;
                while(temp>0)  // 153
                {
                    long rem=temp % 10;
                    if(rem % 2 !=0)
                    {
                         odd=odd+rem;
                    }
                    temp=temp/10;
                }
                return odd;
                 
             }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long x=s.nextLong();
	System.out.print(isarmstrong(x));
	
	}
}


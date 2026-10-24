/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int isarmstrong(int y)
    {
        int cub=0;
        int temp=y;
        while(y>0)
        {
            int rem=y % 10;
            cub=cub+rem*rem*rem;
            y=y/10;
        }
        if(cub==temp)
             {
                 int even=0;
                while(temp>0)  // 153
                {
                    int rem=temp % 10;
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
                 int odd=0;
                while(temp>0)  // 153
                {
                    int rem=temp % 10;
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
	int x=s.nextInt();
	System.out.print(isarmstrong(x));
	
	}
}

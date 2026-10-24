/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int count(int N)
    {
        int c=0;
        for(int i=0;i<=N;i=i+2)
        {
            int x=i;
            int sum=0;
            while(x > 0)
            {
                int rem=x % 10;
               sum=sum+rem;
               x=x/10;
            }
            if(sum % 2==0){
                //System.out.println(i);
              c++;
            }
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		    int result=count(n);
		    System.out.println(result);
	}
}


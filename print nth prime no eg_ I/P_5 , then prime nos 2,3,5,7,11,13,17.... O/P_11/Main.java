/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public int nthPrime(int input1)
    {
        int count=0;
        int z=0;
        for(int i=2;i>0;i++)
            {
                int c=0;
                for(int j=1;j<=i;j++)
                {
                    if(i % j== 0){
                       c++;
                    }
                }
                 if(c==2 )
                     count++;
                     if(count == input1)
                     {
                        z=i;
                         break;
                     }
            }
            return z;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    Main  m=new Main();
		System.out.println(m.nthPrime(n));
	}
}

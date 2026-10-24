/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
 class Main
{
    void primenumsingivenrange(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i % j== 0)
                 c++;
            }
            if(c==2)
               System.out.print(i+" ");
        }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m1=s.nextInt();
	Main m=new Main();
	m.primenumsingivenrange(n,m1);
	}
}





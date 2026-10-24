/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int differencesum(int n,int m)
    {
        int sum1=0,sum2=0;
      for(int i=0;i<=m;i++)
      {
          if(i%n==0)
              sum1=sum1+i;
              else 
              sum2=sum2+i;
      }
     int diff=Math.abs(sum1-sum2);
     return diff;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.print(differencesum(x,y));
	}
}


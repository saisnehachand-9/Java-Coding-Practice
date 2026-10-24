/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int sp(int input1)
    {
       int x[]=new int[100];
       x[0]=0;
       x[1]=1;
       x[2]=1;
       int y[]=new int[100];
       y[0]=0;
       y[1]=1;
       y[2]=2;
       for(int i=3;i<=input1;i++)
       {
           x[i] +=y[i-1];
           y[i] +=x[i-1]+y[i-1];
       }
       int res=x[input1]+y[input1];
        return (res*res);
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	System.out.println(sp(i));
	}
}

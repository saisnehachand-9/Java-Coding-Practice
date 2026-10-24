/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int check(int[] A)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            int num1=A[i];
            int  num2=A[i]+1;
            int prod=num1*num2;
            sum=sum+prod;
        }
        return sum;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
		int  arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		    }
		    int result=check(arr);
		    System.out.println(result);
	}
}

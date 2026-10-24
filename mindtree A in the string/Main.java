/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int check(String[] B)
    {
        int c=0;
        for(int i=0;i<B.length;i++)
        {
            String x=B[i];
            if(x.charAt(0)=='a' || x.charAt(0)=='A')
                 c++;
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String arr[]=new String[n];
		for(int l=0;l<n;l++)
		{
		    arr[l]=s.next();
		}
		  System.out.println(check(arr));
		
	}
}

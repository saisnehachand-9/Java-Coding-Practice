/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int merchant(int l,int Arr[])
    {
        int c=0;
        Arrays.sort(Arr);
        System.out.print(Arrays.toString(Arr));
        for(int j=0;j<l-1;j++)
        {
            if(Arr[j+1]<l)
            {
            if(Arr[j]==Arr[j+1])
            {
                c++;
                j=j+1;
            }
            }
        }
        return c;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	System.out.print(merchant(n,arr));
	}
}

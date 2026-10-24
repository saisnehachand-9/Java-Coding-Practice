/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void met(int n,int S)
    {
        int sum=0;
        int k=0;
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            int j=i+i;
            sum=sum+i+i;
            arr[k]=j;
            k++;
        }
        //System.out.println(Arrays.toString(arr));
        for(int l=0;l<n;l++)
        {
            if(sum-arr[l]==S)
               System.out.println(arr[l]/2);
        }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	int S1=s.nextInt();
	Main m=new Main();
	m.met(N,S1);
	}
}

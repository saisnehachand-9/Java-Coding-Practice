/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int[] funcDistance(int[] inputDist,int start,int end)   //eg :1 3 40 56 ,start=1.end=45..o/p-3 40
    {
       int newarr[]=new int[inputDist.length];
       int k=0;
        for(int j=0;j<inputDist.length;j++)
        {
            if((inputDist[j] > start) && (inputDist[j] < end))
                  newarr[k]=inputDist[j];
                  else
                  newarr[k]=-1;
                  k++;
        }
        return newarr;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    ar[i]=s.nextInt();
	}
	int a=s.nextInt();
	int b=s.nextInt();
		int ab[]=funcDistance(ar,a,b);
		//System.out.println(Arrays.toString(ab));
	for(int m=0;m<ab.length;m++)
	{
	    if(ab[m]!=-1)
	      System.out.print(ab[m]+" ");
	}
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int countpreSorted(int[] arr)
    {
        int c=0;
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            newarr[i]=arr[i];
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==newarr[j])
             c++;
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Arr[]=new int[n];
		for(int l=0;l<n;l++)
	{
	    Arr[l]=s.nextInt();
	}
	System.out.println(countpreSorted(Arr));
	}
}

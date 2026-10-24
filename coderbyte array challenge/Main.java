/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int Arraychalenge(int[] arr)
    {
        Arrays.sort(arr);//5 10 15
        int min=arr[0];
        int high=arr[arr.length-1];
       // int j=0;
        int c=0;
        ArrayList<Integer> list=new ArrayList<Integer>(); // 5 10 15
        for(int j=0;j<arr.length;j++)
        {
            list.add(arr[j]);
        }
        for(int i=min;i<=high;i++)
        {
            if(!list.contains(i))
            {
                c++;
            }
            
        }
        return c;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int Arr[]=new int[n];
	for(int a=0;a<n;a++)
	{
	    Arr[a]=s.nextInt();
	}
	System.out.println(Arraychalenge(Arr));
	}
}

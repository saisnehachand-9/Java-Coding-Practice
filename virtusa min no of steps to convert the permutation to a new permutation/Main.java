/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public int count(int l,int[] arr)
    {
        int c=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        Arrays.sort(arr); //2 2 3 4 
        for(int j=1;j<=l;j++)
        {
            list.add(j);  // 1 2 3 4
        }
        for(int k=0;k<l;k++)
        {
            if(arr[k]!=list.get(k))
                 c++;
        }
        return c;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(); //
	int Arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    Arr[i]=s.nextInt();
	}
	Main m=new Main();
	System.out.println(m.count(n,Arr));
	}
}

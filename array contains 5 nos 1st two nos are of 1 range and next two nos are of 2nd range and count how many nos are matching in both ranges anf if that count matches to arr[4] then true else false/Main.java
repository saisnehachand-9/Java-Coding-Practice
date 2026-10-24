/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static String ArrayChallenge(int[] arr)
    {
        int c=0;
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        for(int i=arr[0];i<=arr[1];i++)
        {
            list1.add(i);
        }
        for(int j=arr[2];j<=arr[3];j++)
        {
            list2.add(j);
        }
        for(int k=0;k<list2.size();k++)
        {
            if(list1.contains(list2.get(k)))
                 c++;
            
        }
        if(c==arr[arr.length-1])
            return "true";
            else
             return "false";
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int Arr[]=new int[n];
		for(int a=0;a<n;a++)
		{
		    Arr[a]=s.nextInt();
		}
		System.out.println(ArrayChallenge(Arr));
		
	}
}




/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int mindiff(List<Integer>  arr)
    {
        int sum=0;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++)
        {
            
            int sub=Math.abs(arr.get(i)-arr.get(i+1));
            sum=sum+sub;
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int j=0;j<n;j++)
		{
		  list.add(s.nextInt());
		}
		System.out.println(mindiff(list));
	}
}

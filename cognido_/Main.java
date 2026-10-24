/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static List<Integer> sol(List<Long> scores,List<Integer> queries)
    {
        ArrayList<Integer> list1=new ArrayList<Integer>();
     for(int i=0;i<queries.size();i++)
     {
         int a=queries.get(i)-1;//0
         long sum=0;
         for(int j=0;j<=a;j++)
         {
             
             sum=sum+scores.get(j);
            
         }
         int y=(int)sum;
             list1.add(y);
     }
     return list1;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long l1=s.nextLong();
		ArrayList<Long> p=new ArrayList<Long>();
		for(long a=0;a<l1;a++)
		{
		    p.add(s.nextLong());
		}
			int l2=s.nextInt();
		ArrayList<Integer> q=new ArrayList<Integer>();
		for(int a=0;a<l2;a++)
		{
		    q.add(s.nextInt());
		}
		System.out.println(sol(p,q));
	}
}

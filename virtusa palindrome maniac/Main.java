/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int y=s.nextInt();
		int c=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=n1;i<=n2;i++)
		{
		    int x=i;
		    int temp=x;
		    String rev="";
		    while(temp > 0)
		    {
		        int rem=temp % 10;
		        rev=rev+String.valueOf(rem);
		        temp=temp/10;
		    }
		    if(x==Integer.valueOf(rev))
		          list.add(i);
		}
		System.out.println(list);
		for(int j=0;j<list.size();j++)
		{
		    for(int a=j+1;a<list.size();a++)
		    {
		       int diff=list.get(a)-list.get(j);
		       if(diff <=y)
		          c++;
		    }
		}
		System.out.println(c);
	}
}


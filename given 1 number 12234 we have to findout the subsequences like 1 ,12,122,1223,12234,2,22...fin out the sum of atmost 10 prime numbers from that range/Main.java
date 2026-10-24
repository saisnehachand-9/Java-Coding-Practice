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
		String s1=s.nextLine();
		int a=Integer.valueOf(s1);
		int sum=0,count=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
			ArrayList<Integer> list1=new ArrayList<Integer>();
			HashSet<Integer> set=new HashSet<Integer>();
				ArrayList<Integer> list3=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++)
		{
		    String c="";
		    for(int j=i;j<s1.length();j++)
		    {
		        c=c+s1.charAt(j);
		        list.add(Integer.valueOf(c)); //1
		    }
		}
		System.out.println(list);
		for(int k=0;k<list.size();k++)
		{
		    int p=list.get(k);
		    int c=0;
		    for(int b=1;b<=p;b++)
		    {
		        if(p % b==0)
		          c++;
		    }
		    if(c==2)
		      list1.add(p);
		}
		System.out.println(list1);
		for(int d=0;d<list1.size();d++){
		    set.add(list1.get(d));
		}
		System.out.println(set);
		for(Integer e:set)
		{
		    list3.add(e);
		}
		Collections.sort(list3);
		System.out.println(list3);
		    for(int f=list3.size()-1;f>=0;f--)
		    {
		        if(count<10 && count>=0)
		        {
		           sum=sum+list3.get(f);
		           count++;
		           
		        }
		    }
		System.out.println(sum);
	}
}

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
	int n=s.nextInt();
	ArrayList<Integer> list1=new ArrayList<Integer>();
	ArrayList<Integer> list=new ArrayList<Integer>(n);
	for(int i=0;i<n;i++)
	{
	    list.add(s.nextInt());
	}
	System.out.print(list);
	Collections.sort(list);
	System.out.print(list);
	for(int a=0;a<n;a++)
	{
	    int c=1;
	    for(int b=a+1;b<n;b++)
	    {
	        if(list.get(a)==list.get(b))
	        c++;
	         }
	         list1.add(c);
	         a=a+c-1;
	    	}
	    	System.out.println(list1);
	    	LinkedHashSet<Integer> link=new LinkedHashSet<Integer>(list);
	    	System.out.print(link);
	    	ArrayList<Integer> list2=new ArrayList<Integer>();
	    	int max=list1.get(0);
	    	System.out.print("max "+max);
	    	for(int k=0;k<list1.size();k++)
	    	{
	    	        if(list1.get(k)==max)
	    	           list2.add(list1.get(k));
	    	            	}
	    	            	System.out.print(list2);
	    	            	ArrayList<Integer> las=new ArrayList<Integer>(link);
	    	            	for(int m=0;m<list2.size();m++)
	    	            	{
	    	            	    for(int f=m+1;f<list2.size();f++)
	    	            	    {
	    	            	        if(las.get(m) > las.get(f))
	    	            	        {
	    	            	          System.out.print("lottery winner :"+las.get(m));
	    	            	          break;
	    	            	        }
	    	            	          else
	    	            	          {
	    	            	          System.out.print("lottery winner :"+las.get(f));
	    	            	          break;
	    	            	          }
	    	            	    }
	    	            	}
	    	
	}
}

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
		int c=0;
		int Arr[]=new int[n];
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int l=0;l<n;l++)
		{
		    Arr[l]=s.nextInt();
		    list.add(Arr[l]);
		    
		}
		System.out.println(list);
		System.out.println(Arrays.toString(Arr));
		ArrayList<Integer> list2=new ArrayList<Integer>();
		int mn=0;
		while(mn<n){
    for(int j=1;j<list.size();j++)
	{
	     int x=j-1;
	   if(list.get(j)>list.get(x))
	      list2.add(list.get(j));
	 }
	 list.removeAll(list2);
	  System.out.println(list);
	 if(list2.size()>0)
	        c++;
	         list2.clear();
	mn++;
           }
           System.out.println(c);
	}
}

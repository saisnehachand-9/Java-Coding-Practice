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
	    int siz=s.nextInt();
		int arr[]=new int[siz]; 
		for(int k=0;k<siz;k++) //1 0 2 0 3 4 0 0 8 9 0     1 2 3 4 8 9 0 0 
		{
		    arr[k]=s.nextInt();
		}
		ArrayList<Integer> link=new ArrayList<Integer>();
		ArrayList<Integer> link1=new ArrayList<Integer>();
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=0)
		         link.add(arr[i]);
		         if(arr[i]==0)
		             link1.add(arr[i]);
		}
		System.out.println(link);
		System.out.println(link1);
		int l1=link.size();
		int l2=link1.size();
		int newarr[]=new int[l1+l2];
		System.out.println(newarr.length);
		for(int l=0;l<l1;l++)
		{
		    newarr[l]=link.get(l);
		    c++;
		}
		System.out.println(c);
		for(int m=c;m<l1;m++)
		{
		    newarr[m]=link1.get(m);
		}
		System.out.println(Arrays.toString(newarr));
	}
}


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
	   int arr[]=new int[n];
	   for(int i=0;i<arr.length;i++)
	   {
	       int j=s.nextInt();
	       arr[i]=j;
	   }
	   System.out.print(Arrays.toString(arr));
	 // Set<Integer> set1=new LinkedHashSet<Integer>(Arrays.asList(arr));
	  ArrayList<Integer> list1=new ArrayList<Integer>(arr.length);
	  for(int j:arr)
	  {
	      list1.add(j);
	  }
	  System.out.print(list1);
	  LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>( );
	  for(Integer k:list1)
	  {
	      set1.add(k);
	  }
	   System.out.print(set1);
	   ArrayList<Integer> new1=new ArrayList<Integer>(set1);
	   for(int l=new1.size()-1;l>=0;l--)
	   {
	       System.out.print(l+" ");
	   }
	}
}

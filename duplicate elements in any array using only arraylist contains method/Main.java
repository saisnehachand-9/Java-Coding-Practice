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
	int arr[]={1,2,1,3,2,4,4};
	ArrayList<Integer> list1=new ArrayList<Integer>();
	ArrayList<Integer> list2=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++)
	{
	    list1.add(arr[i]);
	}
	for(int j=0;j<list1.size();j++)
	{
	   if(list2.contains(list1.get(j)))
	     System.out.println(list1.get(j));
	     else
	     list2.add(list1.get(j));
	}
	}
}

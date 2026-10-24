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
	int num=s.nextInt();
	int arr[]=new int[n];
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	    if(arr[j]==num)
	         {
	            num=num*2;
	           list.add(num);
	          
	         }
	}
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list.get(list.size()-1));
	}
}

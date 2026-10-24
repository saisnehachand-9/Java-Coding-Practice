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
		String s="aabbccabcd";
		String arr[]=s.split("");
		int x=3;
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	ArrayList<String> count=new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
		    int c=1;
		    for(int j=i+1;j<arr.length;j++)
		    {
		       if(arr[i].equals(arr[j]))
		           c++;
		    }
		    if(c==x)
		    {
		    count.add(arr[i]);
		    }
		    i=i+c-1;
		}
		System.out.println(count);
		System.out.println(count.get(0));
	}
}


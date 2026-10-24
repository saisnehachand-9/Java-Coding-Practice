/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	String arr[]=new String[n];  //[eat,bat,ate,tub,pen,but]
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.next();
	}
	System.out.println(Arrays.toString(arr));
	int c=0;
	for(int i=0;i<n-1;i++)
	{
	    for(int j=i;j<n;j++)
	    {
	        if(i!=j)
	        {
	            String x=arr[i];
	            String y=arr[j];
	            char arr1[]=x.toCharArray();
	            char arr2[]=y.toCharArray();
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);
	            if(Arrays.equals(arr1,arr2)==true)
	            {
	                c++;
	                System.out.println(x);
	            }
	        }
	    }
	}
	System.out.println(c);
	}
}

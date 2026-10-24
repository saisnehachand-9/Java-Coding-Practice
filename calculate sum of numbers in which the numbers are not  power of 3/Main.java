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
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	int sum=0;
	for(int i=0;i<n;i++)
	{
	    int x=arr[i];
	    int n1=arr[i];
	    if(x % 3 !=0 )
	       sum=sum+x;
	       else{
	    while(x% 3 == 0)
	    {
	        x=x/3;
	    }
	    if(x > 1)
	        sum=sum+n1;
	       }
	}
	System.out.println(sum);
	}
}

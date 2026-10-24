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
	int n1=0,n2=1,n3=0;
	int no=9;
	int no1=no-2;
	int i=2;
	int arr[]=new int[no+1];
	arr[0]=n1;
	arr[1]=n2;
	while(no1 >= 0)
	{
	    n3=n1+n2;
	    arr[i]=n3;
	    i++;
	    n1=n2;
	    n2=n3;
	    no1--;
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(arr[no-1]+arr[no-2]);
	}
}

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
	System.out.println("Enter the array size");
	int n=s.nextInt();
	if(n > 5 && n <=10){
	System.out.println("Enter the array elements");
	int arr[]=new int[n];
	int a=0,b=0,low=0,index=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
	}
	int larg=0;
	for(int j=0;j<n;j++)  // 1 2 3 4 5 6
	{
	    int k=j+2;
	    if(k<arr.length)
	    {
	    int diff=Math.abs(arr[j]-arr[k]);
	    // 2  2  2 2
	    if(diff > larg)
	    {
	       larg=diff;
	       a=arr[j];
	       b=arr[k];
	    }
	    }
	}
//	System.out.println(larg +" " +a+" "+b);
	if(a<b )
	    low=a;
	   else
	    low=b;
	  //System.out.println(low);
	  for(int m=0;m<arr.length;m++)  //1 5 2 8 9
	  {
	      if(arr[m]==low)
	      {
	         index=m;
	         break;
	      }
	  }
	  System.out.println(index);
	}
	else
	   System.out.println("Invalid array size");
	}
}

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
	    int arr[]={1,2,4,8,10};
	             //0 1 2 3 4
	 int x=11;
	 int l=0,h=arr.length-1; //4
	 
	  while(l<=h)  //0<=4 3<=4
	  {
	      int mid=(l+h)/2;    // 2 3
	  if(x==arr[mid])
	  {
	     System.out.println("element found at mid ");
	     break;
	  }
	     else if(x < arr[mid])
	         h=mid-1;
	         else  if(x > arr[mid])
	             l=mid+1;  //3  4
	  }
	  if(l > h)
	    System.out.println("element not found");
	 
	         
	 
	}
}


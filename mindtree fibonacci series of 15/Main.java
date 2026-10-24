/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) { // 0 1 1  2 3 5 8 13 21
	Scanner s=new Scanner(System.in);
	 int n=s.nextInt();  // 15
	 int n1=0,n2=1;
	 System.out.print(n1+" "+n2+" ");
	 int x=n1+n2; // 1
	 while(x <= 15)
	 {
	     int sum=n1+n2; // 1 2
	     if(sum<=15)
	       System.out.print(sum+" "); // 1 
	     n1=n2; // 1 
	     n2=sum; //1 
	     x=sum;// 1
	 }
	 
	}
}

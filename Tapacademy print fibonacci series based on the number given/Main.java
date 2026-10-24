/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {    // 0 1 1 2 3 
	    Scanner s=new Scanner(System.in);
	  
       int i=0;
       int j=1;
       System.out.println("Enter a number");
       int c=2;
       int n=s.nextInt();
       	System.out.print(i+" "+j+" ");
       
             while(c<n){
             int sum=i+j;
		System.out.print(sum+" ");
		      i=j;
		      j=sum;
		      c++;
             }
	}
}

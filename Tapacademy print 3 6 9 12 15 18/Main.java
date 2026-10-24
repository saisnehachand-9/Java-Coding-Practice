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
	  
	    for(int i=1;i<=n*3;i++)
	    {
	        if(i%3==0)
	        	System.out.println(i);
	        
	    }
	 // or
	 for(int i=3;i<=n*3;i=i+3)
	 {
	     	System.out.println(i);
	        
	 }
	 //or
	 for(int i=1;i<=n;i++)
		 {
	     	System.out.println(3*i);
	        
	 }
	  //or
	  int j=3;
	 for(int i=1;i<=n;i++)
		 {
		     
	     	System.out.println(j);
	     	j=j+3;
	        
	 }
	}
}

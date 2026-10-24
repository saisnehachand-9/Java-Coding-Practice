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
		 int res=0;
		  while(n>0)
		  {
		      int rem=n%10;//3
		      int div=n/10;//12
		      res=res*10+rem;
		      n=div;
		      
		  }
		    System.out.println(res);
		    //System.out.println(" consonants: "+consonants);
		    
	}
}

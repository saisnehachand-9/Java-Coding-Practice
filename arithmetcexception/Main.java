/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    try {
	        	int a=10/0;
	System.out.print(a);
	        
	    }
	    catch(ArithmeticException e) {
	     System.out.print("arithmetic exception");   
	    } 
	   

	}
}

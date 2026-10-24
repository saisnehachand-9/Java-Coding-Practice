/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
   
    void show(int x)
    {
        x=x+1;
      System.out.println(x);
    }
}
public class Main
{
	public static void main(String[] args) {
	    A a=new A();
	   int x=10;
	    	System.out.println(x);
	a.show(x);
	System.out.println(x);
	}
}

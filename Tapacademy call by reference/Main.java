/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int x=10;
    void show(Main m)
    {
        m.x=m.x+1;
        System.out.println(m.x);
    }
	public static void main(String[] args) {
	    Main m=new Main();
	   
	     System.out.println(m.x);
	     m.show(m);
	      System.out.println(m.x);
	
	}
}

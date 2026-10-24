/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
    
    A()
    {
        System.out.println("super1");
    }
}
public class Main extends A
{
    Main()
    {
        super();
        System.out.println("CHILD");
        
    }
  
   public static void main(String[] args) {
	    Main m=new Main();
	}
}

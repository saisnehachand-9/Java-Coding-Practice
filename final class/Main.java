/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
final class A{
   void disp()
   {
       System.out.println("hi");
   }
}
class B extends A{
     void disp1()
   {
       System.out.println("bi");
   }
}
public class Main
{
	public static void main(String[] args) {
	B b=new B();
	b.disp1();
	}
}

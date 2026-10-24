/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A 
{
    int x=10;
}
class B extends A{
   int x=20;
   void disp()
   {
  System.out.println(super.x);
   System.out.println(x);
   }
}
public class Main
{
	public static void main(String[] args) {
	B a1=new B();
	a1.disp();
	}
}

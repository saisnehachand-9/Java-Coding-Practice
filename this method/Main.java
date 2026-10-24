/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A 
{
    void disp()
    {
        System.out.println("hi");
    }
    void show()
    {
        this.disp();
        System.out.print("bi");
    }
}
public class Main
{
	public static void main(String[] args) {
	A a1=new A();
	a1.show();
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int a=10;
    void b(int a)
    {
        a+=20;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m=new Main();
		System.out.print("b4"+m.a);
		m.b(20);
		System.out.print(m.a);
	}
}

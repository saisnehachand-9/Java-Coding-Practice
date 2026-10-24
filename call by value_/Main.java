/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    int x=10;
    void show(int x)
    {
        x=x+1;
    }
	public static void main(String[] args) {
	Main m=new Main();
	m.show(2);
	System.out.print(m.x);
	}
}

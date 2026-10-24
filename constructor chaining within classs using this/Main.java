/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    Main()
    {
        System.out.println("hi");
        
    }
    Main(int x,int y)
    {
        this();
        System.out.println("2nd");
    }
    Main(int z)
    {
        this(10,20);
    }
	public static void main(String[] args) {
	    Main m=new Main(23,67);
	}
}

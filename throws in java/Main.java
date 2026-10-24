/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    void check(int x,int y) throws ArithmeticException
    {
        int div=x/y;
        System.out.println(div);
    }
	public static void main(String[] args) {
		Main m=new Main();
		int a=3;
		int b=0;
		try {
		  m.check(a,b);  
		}
		catch(ArithmeticException e)
		{
		    System.out.println("no cannot be divisible by 0");
		}
	}
}

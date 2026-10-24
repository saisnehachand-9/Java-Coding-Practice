/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A
{
    int x=10;
    A(int y)
    {
        x=x+y;
        System.out.println(x);
    }
}
public class Main
{
    public static void main(String args[])
    {
        A a=new A(20);
          A a1=new A(30);
    }
}
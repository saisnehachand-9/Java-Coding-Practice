/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class A{
     int x=10;
     A()
     {
         System.out.println("hiiiii");
     }
    void disp()
    {
        System.out.println("hi");
    }
}

public class Main extends A
{
    int x=20;
    void cal()
    {
        System.out.println(super.x);
         System.out.println(x);
    }
    public static void main(String args[])
    {
        Main m=new Main();
        m.cal();
    }
    
}

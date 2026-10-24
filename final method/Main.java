/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
   final void disp()
    {
       
        System.out.print("FINAL");
    }
}
class C extends A
{
    void disp()
    {
         System.out.print("bi");
    }
}
class Main{
        public static void main(String args[])
        {
         C a=new C();
         a.disp();
        }
    }
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
     static int x=10;
     static void disp()
     {
         System.out.println("hi");
         x=x+20;
     }
     void show()
     {
       System.out.println(x);   
     }
    
}
class Main{
   public static void main(String args[])
   {
       A a=new A();
      A.disp();
      a.show();
}
      
   }

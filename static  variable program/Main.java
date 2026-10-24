/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
   int rollno;
   String name;
  static String college="GIET";
   A(int rollno,String name)
   {
       this.rollno=rollno;
       this.name=name;
   }
   void display()
   {
       System.out.println(college+" "+rollno+" "+name);
   }
}
class Main{
    public static void main(String args[])
    {
        A a=new A(1,"sneha");
         A a1=new A(2,"sudha");
         a.display();
         a1.display();
    }
}
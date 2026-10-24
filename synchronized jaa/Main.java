/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A extends Thread{
   synchronized void disp()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("first :"+i);
        }
    }
    public void run()
    {
        disp();
    }
}
class B extends Thread{
    synchronized public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("Second :"+i);
        }
    }
}
public class Main  extends Thread
{
  synchronized  public  void run()
    {
         for(int i=0;i<4;i++)
        {
            System.out.println("Third :"+i);
        }
    }
	public static void main(String[] args) {
	    A a=new A();
	    B b=new B();
	    Main m=new Main();
	    a.start();
	    b.start();
	    m.start();
	
	}
}

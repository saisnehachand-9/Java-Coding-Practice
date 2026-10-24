/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main extends Thread
{
   public  void run()

{
    System.out.println(Thread.currentThread().getName());
     System.out.println(Thread.currentThread().getPriority());
}

    public static void main(String[] args) {
	           Main m1=new Main();
	           m1.setPriority(Thread.MIN_PRIORITY);
	           Main m2=new Main();
	           m2.setPriority(Thread.MAX_PRIORITY);
	           m1.start();
	           m2.start();
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
    int x=10;
     void disp1()
      {
         	System.out.println("parent"); 
      }
    void disp()
    {

        int x=20;
        this.disp1(); 
        	System.out.println("child");
        	disp1();//compiler will automatically add this before disp1()
        		System.out.println(this.x);
    }
    Main()
    {
         this(30);
         disp1();//calling a method from constructor
        System.out.println("default cons");
       
    }
    Main(int y)
    {
        
        System.out.println("parameterized cons");
    }
	public static void main(String[] args) {
	   new Main().disp();
	   

	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class A{
    abstract void show();
    static void disp()
    {
        	System.out.println("disp");
    }
}
public class Main extends A
{
    void show()
    {
        	System.out.println("Hello World");
    }
	public static void main(String[] args) {
	Main m=new Main();
	A.disp();
A m1=new Main();
m1.show();
m.show();
	}
}

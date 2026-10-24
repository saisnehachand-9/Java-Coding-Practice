/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class A{
    int y=30;
    A(){
    int x=10;
    System.out.println(x);
    }
    A(int x)
    {
       System.out.println(x); 
    }
    void add()
    {
        System.out.println("parent method");
    }
}
public class Main extends A
{
    Main()
    {
        super(20);
        System.out.println("hi");
    }
  
   Main(int y)
    {
        System.out.println("bi");
    }
    void add()
    {
        super.add();
        System.out.println("child method");
         System.out.println(super.y);
    }
	public static void main(String[] args) {
		Main m=new Main();
		  Main m1=new Main(20);
		  m1.add();
	
	}
}

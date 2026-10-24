/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
      int x=10;
    {
   	System.out.println("instance block : "+x);
    }
    Main()
    {
        System.out.println("constructor: "+x);
    }
    void disp()
    {
      System.out.println("Instance method : "+this.x+" or "+x);  
    }
   
	public static void main(String[] args) {
	Main m=new Main();
	m.disp();
	
	}
	
}

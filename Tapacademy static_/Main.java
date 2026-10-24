/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
      static int x=10;
      int y=20;
     
      static{
          System.out.println("Static block: "+x);
           //System.out.println("Static block: "+y); //error
      }
    {
   	System.out.println("instance block : "+x);
   		System.out.println("instance block : "+y);
    }
    Main()
    {
        System.out.println("constructor: "+x);
        System.out.println("constructor: "+y);
    }
    void disp()
    {
      System.out.println("Instance method : "+this.x+" or "+x);
       System.out.println("Instance method : "+this.y+" or "+y);
    }
    static void show()
    {
        System.out.println("static method : "+x);
        // System.out.println("static method : "+y); error
    }
    
   
	public static void main(String[] args) {
	Main m=new Main();
	m.disp();
	Main.show();
	
	}
	
}

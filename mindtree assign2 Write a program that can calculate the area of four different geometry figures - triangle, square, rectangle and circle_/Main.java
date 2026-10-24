/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.text.DecimalFormat;
 public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter figure type");
	String s1=s.nextLine();
	DecimalFormat df = new DecimalFormat("0.00");
	if(s1.equals("Triangle"))
	     {
	         int side=s.nextInt();
	         int height=s.nextInt();
	         double area=(double)((side * height)/2);
	        System.out.println(df.format(area));
	     }
	     if(s1.equals("Square"))
	     {
	         int side=s.nextInt();
	        System.out.println(df.format((double)(side * side)));
	     }
	     if(s1.equals("Rectangle"))
	     {
	         int width=s.nextInt();
	         int height=s.nextInt();
	        System.out.println(df.format((double)(width * height)));
	     }
	     if(s1.equals("Circle"))
	     {
	         int radius=s.nextInt();
	        System.out.println((3.14)* radius *radius);
	     }
	
	}
}

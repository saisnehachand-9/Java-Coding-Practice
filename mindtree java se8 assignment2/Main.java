/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int marks=0;
    static String name;
    static String grade;
     static int c;
    static int pinno;
    Main(String name,int pinno,int marks,String grade)
    {
        this.name=name;
        this.pinno=pinno;
        this.marks=marks;
        this.grade=grade;
        
    }
    static{
          c=0;
    }
    static void display()
    {
        c++;
         System.out.println(c);
         System.out.println("name is : "+name+ " & pin no is: "+pinno);
        System.out.println("marks of " +name+" is : "+marks);
         System.out.println("grade of " +name+" is : "+grade);
          System.out.println();
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Main m=new Main("sneha",549,89,"A");
		m.display();
			Main m1=new Main("sudha",550,95,"A+");
		m1.display();
	}
}

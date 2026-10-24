/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt(); //20
	int y=s.nextInt();//68
	int z=s.nextInt();//12
	if ((x>y) && (x>z))
	   System.out.println(x);
	   else if((y>x)&&(y>z))
	     System.out.println(y);
	     else
	      System.out.println(z);
	}
}

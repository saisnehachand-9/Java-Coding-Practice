/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int energy=s.nextInt();//4
		int rate=s.nextInt();//3
		int time=s.nextInt();//5
		int produce=energy+rate; //7
		while((time-1)>1)                           
		{
		    produce=produce+rate;
		    time--;
		}
		System.out.println(produce);
		// while(time>1)
		//{
		   // energy=energy+rate;
		//}
	}
}

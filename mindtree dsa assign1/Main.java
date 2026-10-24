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
		String s1=s.nextLine();
		String s2=s.nextLine();
		String arr1[]=s1.split("-");
			String arr2[]=s2.split("-");
			String x1=arr1[arr1.length-1];
				String x2=arr2[arr2.length-1];
				String y1=arr1[0]+"-"+x2;
					String y2=arr2[0]+"-"+x1;
					System.out.println(y1);
						System.out.println(y2);
	}
}

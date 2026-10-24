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
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	System.out.print(list1);
	list1.add(0,4);
	System.out.print(list1);
	list1.set(0,3); //
		System.out.print(list1);
			ArrayList<Integer> list2=new ArrayList<Integer>();
			list2.add(100);
			list2.add(200);
			System.out.print(list2);	
			list1.addAll(list2);
				System.out.print(list1);
				list1.addAll(1,list2);
				System.out.print(list1);
				list1.remove(3);
					System.out.print(list1);
					list1.removeAll(list2);
						System.out.print(list1);
				}
}

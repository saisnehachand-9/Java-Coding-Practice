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
	Stack<String> str=new Stack<String>();
	str.push("sneha");
		str.push("sudha");
			str.push("shiny");
				str.push("sony");
				System.out.println(str.search("sudha"));
							System.out.println(str.search("sneha"));
								System.out.println(str.search("shiny"));
									System.out.println(str.search("sony"));
				System.out.println(str.peek());
					System.out.println(str.pop());
								System.out.println(str.search("sony"));
									System.out.println(str.search("sh"));
	}
}


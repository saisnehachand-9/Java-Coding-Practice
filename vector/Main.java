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
		Vector<String> vec=new Vector<String>();
		vec.add("shiny");
		vec.add("sony");
		vec.add("sneha");
		vec.add("sudha");
	for(int i=0;i<vec.size();i++)
	{
	    System.out.print(vec.get(i));
	    if(i<vec.size()-1)
	    {
	        System.out.print(",");
	    }
	}
	ArrayList<String> list1=new ArrayList<String>(vec);
	 System.out.print(list1);
	}
}

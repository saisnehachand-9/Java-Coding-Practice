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
	ArrayList<String> list=new ArrayList<String>();
	list.add("sneha");
	list.add("sudha");
	list.add("shiny");
	for(int i=0;i<list.size();i++)
	{
	    if(list.get(i).equals("shiny")){
	        list.remove(list.get(i));
	        	System.out.println(list.get(i));
	    }
	}
	System.out.println(list);
	}
}

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
	ArrayList<String> list=new ArrayList<String>();
	list.add("hi");
	list.add("bi");
	list.add("hello");
	System.out.print(list);
	String s1="hello";
	if(list.contains(s1))
	{
                   for(int i=0;i<list.size();i++){         //if(list.contains(s1)
	        if(list.get(i).equals(s1))                    //  list.set(list.indexOf(s1),"A");
	           list.set(i,"A");}
	}
	System.out.print(list);
}
}

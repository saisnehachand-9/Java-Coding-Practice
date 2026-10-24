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
	int n=s.nextInt();
	int m=s.nextInt();
ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=n;i>0;i--) 
	{
	    int y=m%i;
	    list.add(y);
	   
	}
	//System.out.println(list);
	Collections.sort(list);
	System.out.println(list.get(list.size()-1));
	}
}

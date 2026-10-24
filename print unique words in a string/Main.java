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
	String s1=s.nextLine();    // sai sneha sudha chand sai sudha 
	String arr[]=s1.split(" ");  // sneha chand
	HashSet<String> set=new HashSet();
	for(int i=0;i<arr.length;i++)
	{
	    set.add(arr[i]);
	}
	//System.out.println(set);
	for(int i=0;i<arr.length;i++)
	{
	    int c=0;
	    for(int j=0;j<arr.length;j++)
	    {
	        if(i != j){
	        if(arr[i].equals(arr[j]))
	            c++;
	        }
	    }
	    if(c==0)
	      System.out.println(arr[i]);
	}
	}
}

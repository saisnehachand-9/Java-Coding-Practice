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
		String arr[]=s1.split("\\s");
		String res="";
		for(String words:arr)
		{
		    String first=words.substring(0,1);
		    String remaining=words.substring(1);
		    res=res+first.toUpperCase()+remaining+" ";
		}
		System.out.print(res.trim());
	}
}

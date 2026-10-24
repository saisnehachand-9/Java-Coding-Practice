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
	String arr[]=s1.split(" ");
    int c=0;
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length-1;i++)
	{
	    for(int j=i+1;j<arr.length;j++)
	    {
	        if(arr[i].equals(arr[j]))
	           c++;
	    }
	}
	System.out.println("count of similar words :"+c);
	int unique=2*c;
	System.out.println("count of unique words :"+(arr.length-unique));
	}
}

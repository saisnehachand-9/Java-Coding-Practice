/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

******************;**************************************************************/
import java.util.*;
public class Main
{
    public static String  longesteven(String sentence)
    {
        int high=0;
	String arr[]=sentence.split(" ");  // time to write great code 
	int j=0;
	for(int i=0;i<arr.length;i++)
	{
	    int l=arr[i].length(); //4
	    if((l % 2 ==0) && (l>high))
	    {
	        
	           j=i; 
	           high=l;
	    }
	}
	return arr[j];
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println(longesteven(s1));
		
	}
}

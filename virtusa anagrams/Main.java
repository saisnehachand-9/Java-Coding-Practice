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
	String s2=s.nextLine();
	if(s1.length()==s2.length())
	{
	    char arr1[]=s1.toCharArray();
	     char arr2[]=s2.toCharArray();
	     Arrays.sort(arr1);
	      Arrays.sort(arr2);
	      if(Arrays.equals(arr1,arr2))
	      {
	          System.out.println("Anagrams");
	      }
	      else{
	           System.out.println("Not Anagrams");
	      }
	}
	}
}

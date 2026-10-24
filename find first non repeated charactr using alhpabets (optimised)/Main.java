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
	    String s1=s.nextLine();//aabccdef
	    int frequency[]=new int[26];
	    for(int i=0;i<s1.length();i++)
	    {
	        int index=s1.charAt(i)-'a';//0
	        frequency[index]+=1;
	    }
	//	System.out.println(Arrays.toString(frequency));

	 //  System.out.println("nothing found");
	   int found=0;
		for(int i=0;i<s1.length();i++)
		{
		    char ch=s1.charAt(i); // abcabcc
		    int index=s1.charAt(i)-'a'; 
		    int n=frequency[index];
		    if(n==1)
		       {
		           System.out.println(ch);
		           found=1;
		           break;
		       }
		}
		if(found==0)
		 System.out.println("not found non repeating characters");
	}
}

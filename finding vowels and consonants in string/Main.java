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
		String s1=s.nextLine();
		 s1=s1.toLowerCase();
	int vowels=0;
	int consonants=0;
		for(int i=0;i<s1.length();i++)
		{
		   if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		   {
		       if((s1.charAt(i))=='a' || (s1.charAt(i))=='e' || (s1.charAt(i))=='i' || (s1.charAt(i))=='o'|| (s1.charAt(i))=='u')
	            vowels++;
	            else
	            consonants++;
		   }
		}
		
		    System.out.println(" vowels: "+vowels);
		    System.out.println(" consonants: "+consonants);
	}
}

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
	    int co=0;
	while(co<5)
	{
	   String s1=s.nextLine();   //saisneha
	   String res="";
	   int c=0;
	   for(int i=0;i<s1.length()-1;i++)
	   {
	       int j=i+1;
            res=res+String.valueOf(s1.charAt(j))+String.valueOf(s1.charAt(i));
            i=i+1;
	   }
	   System.out.println(res);
	   co++;
	}
	}
}

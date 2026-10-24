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
	    String str2=s.nextLine();
	    String consonants="";
       String arr[]=str2.split(" ");// sai aeiou
       for(int i=0;i<arr.length;i++)
       {
    	   int c=0;
    	   for(int j=0;j<arr[i].length();j++)
    	   {
    		  if(arr[i].charAt(j)!='a' && arr[i].charAt(j)!='e' && arr[i].charAt(j)!='i' && arr[i].charAt(j)!='o' && arr[i].charAt(j)!='u')
    			     c++;
    	   }
    	   System.out.println(c);
    	   if(c>=3) {
    		 if(c>=3) {
    		   consonants=consonants+arr[i];
    		   if(i!=arr.length-1)
    			    consonants=consonants+" ";
    	   }
    	   }
       }
      
	   System.out.println(consonants);
}
}

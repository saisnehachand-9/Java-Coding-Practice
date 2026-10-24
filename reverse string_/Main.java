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
		 String arr[]=s1.split(" ");
		 System.out.println(Arrays.toString(arr));
		 String revarray[]=new String[arr.length];
		 int j=0;
		 for(int i=arr.length-1;i>=0;i--)//[sneha,sudha,vikku]
		 {
		     revarray[j]=arr[i];
		     j++;
		 }
          System.out.println(Arrays.toString(revarray));
		    
	}
}

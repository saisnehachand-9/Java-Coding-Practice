/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public String reverseString(String input1)
    {
        String rev="";
        String arr[]=input1.split(" ");
        for(int i=input1.length()-1;i>=0;i++)
        {
            String s1=arr[i];
              String res="";
            for(int j=0;j<s1.length();j++)
	    {
	        res=res+s1.charAt(j);
	    }
	     rev=rev+res+" ";
        }
        return rev;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		Main m=new Main();
		System.out.println(m.reverseString(s1));
	}
}

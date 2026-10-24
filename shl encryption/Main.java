/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static char lostChar(String s1,String s2)
    {
       char[] arr1=new char[s1.length()]; //abcdefgjjr
       char[] arr2=new char[s1.length()]; //abcdefgjr
       for(int a=0;a<s1.length();a++)
       {
           arr1[a]=s1.charAt(a);
       }
        for(int b=0;b<s2.length();b++)
       {
           arr2[b]=s2.charAt(b);
       }
       Arrays.sort(arr1);
        Arrays.sort(arr2);
       char ch='\u0000';
            for(int i=0;i<s2.length();i++)
            {
                if(arr2[i]!=arr1[i])
                  ch=arr1[i];
            }
        return ch;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String st1=s.nextLine();
	String st2=s.nextLine();
	System.out.println(lostChar(st1,st2));
	}
}

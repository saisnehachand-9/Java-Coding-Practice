/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static String check(String s1)
    {
        for(int a=0;a<s1.length();a++)
        {
            if(a+1<s1.length())
                
        }
        String res="";
        ArrayList<Integer> list1=new ArrayList<Integer>();//3,2
        ArrayList<Character> list2=new ArrayList<Character>();//a,b
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {
               list1.add(Character.getNumericValue(s1.charAt(i)));
            }
                if(Character.isLetter(s1.charAt(i)))
               list2.add(s1.charAt(i));
        }
               for(int k=0;k<list1.size();k++)
               {
                  int x=list1.get(k); //3
                  for(int l=0;l<x;l++)
                  {
                      res=res+list2.get(k); //aaa
                  }
               }
               return res;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		String str=s.nextLine();//a3b2
		System.out.print(check(str));
	}
}
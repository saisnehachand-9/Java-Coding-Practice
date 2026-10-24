/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static StringChallenge(String str)
    {
        String rev="";
        StringBuilder sb=new StringBuiler(str);
        for(int i=str.length-1;i>=0;i++)
        {
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str))
          return str;
          else
          {
              for(int j=0;j<str.length()-1;j++)
              {
                  char ch1=str.charAt(j);
                  char ch2=str.charAt(j+1);
                  sb.setCharAt(j,ch1);
                  sb.setCharAt((j+1),ch2);
                  StringBuilder sb1=sb;
                  sb1.reverse();
                  StringBuilder sb2=sb;
                  String str1=sb1.toString();
                  String str2=sb2.toString();
                  if(str1.equals(str))
                      {
                          return str1;
                      }
              }
          }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println(StringChallenge(s1));
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    int valid(String s1,int len)
    {
        if(len < 4)  
           return 0;
           if((s1.charAt(0))>='0' && (s1.charAt(0))<='9')
             return 0;
             int no=0,ch=0;
             for(int i=0;i<len;i++)
             {
                 if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
                    ch++;
                    if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
                          no++;
                          if(s1.charAt(i)==' ' || s1.charAt(i)=='/')
                               return 0;
             }
             if(ch >=1 && no >=1)
               return 1;
                else 
                 return 0;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	String str=s.next();
	int l=str.length();
	Main m=new Main();  /// or u can directly call the method whithout creating object by making the method as static
	System.out.print(m.valid(str,l));
	}
}


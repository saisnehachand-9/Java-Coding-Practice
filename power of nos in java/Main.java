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
	      int x=1234;
	      String no=String.valueOf(x);
	      Double res=0.0;
	      for(int i=0;i<no.length();i++)
	      {
	          if(i+1 <no.length()) //1<4 2<4 3<4
	              {
	           Double y=Math.pow(Character.getNumericValue(no.charAt(i)),Character.getNumericValue(no.charAt(i+1)));
	           System.out.println(y);
	               res=res+y;
	              }
	              else
	              {
	                  res=res+Character.getNumericValue(no.charAt(i));
	              }
	      
	      }
	      System.out.println(Integer.valueOf(res));
	}
}

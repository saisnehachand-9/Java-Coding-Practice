/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
  public static int count (int N)
  {
    int c = 0;
    for (int i = 0; i <= N; i++)
      {
	String x = String.valueOf (i);	//0
	int sum = 0;
	for (int j = 0; j < x.length (); j++)
	  {
	    int l = Character.getNumericValue (x.charAt (j));
	      sum = sum + l;
	  }
	if (sum % 2 == 0)
	  c++;
      }
    return c;
  }
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    System.out.println (count (n));
  }
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
    int i =65, c1 = 0,c2=0;
    int j = i;
    while (i > 0)
      {
	String s1 = String.valueOf (i);
	  System.out.println (s1);
	if (s1.charAt (s1.length () - 1) == '0')
	  {
	    break;
	  }
	c1++;
	i--;
      }
    System.out.println ("count of i :" + c1);
    while (j > 0)
      {
	String s2 = String.valueOf (j);
	System.out.println (s2);
	if (s2.charAt (s2.length() -1) == '0')
	  {
	    break;
	  }
	c2++;
	j++;
      }
System.out.println("count of j :"+c2);
System.out.println("i :"+i);
System.out.println(" j :"+j);
if(c1<c2)
  System.out.println("round value is :"+i);
  if(c2<c1)
    System.out.println("round value is :"+j);
  if(c2==c1)
    System.out.println("round value is :"+i);

  }
}

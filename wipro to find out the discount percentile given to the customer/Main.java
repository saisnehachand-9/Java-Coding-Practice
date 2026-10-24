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
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String s1=String.valueOf(a);
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<s1.length();i++)
		{
		    for(int j=0;j<s1.length();j++)
		    {
		        if(i !=j)
		        {
		            if(s1.charAt(i)==s1.charAt(j))
		            {
		                int k=Character.getNumericValue(s1.charAt(j));
		                set.add(k); 
		            }
		        }
		    }
		   
		}
		System.out.println(set.size());
	}
}


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
		String s1=s.nextLine();
		//LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		ArrayList<Character> list=new ArrayList<Character>();
		ArrayList<Character> list1=new ArrayList<Character>();
		for(int i=0;i<s1.length();i++)
		{
		    if(Character.isLetter(s1.charAt(i)))
		         list.add(s1.charAt(i));
		         else
		         {
		             System.out.println("invalid sentence");
		             break;
		         }
		         
		}
		System.out.println(list);
//Collections.sort(list);
System.out.println(list);
		for(int j=0;j<list.size();j++)
		{
		    int c=0;
		   for(int k=0;k<list.size();k++)
		   {
		       if(j !=k)
		       {
		           if(list.get(j)!=list.get(k))
		               c++;
		       }
		   }
		   //System.out.println(list.get(j)+" "+c);
		   if(c==list.size()-1)
		      list1.add(list.get(j));
		}
		if(list1.isEmpty())
		{
		    System.out.println("No Unique characters");	
		}
		else{
	System.out.println("Unique characters");
	for(int l=0;l<list1.size();l++)
	{
	    System.out.println(list1.get(l));
	}
		}
		
	}	
}

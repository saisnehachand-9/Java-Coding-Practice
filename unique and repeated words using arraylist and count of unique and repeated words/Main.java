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
		String s1="hello hi sai how are you sai ";
	String res="";
	int c=0;
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();
for(int k=0;k<s1.length();k++)
{
    if(s1.charAt(k)!=' ')
    {
         res=res+s1.charAt(k);
      
    }
         else
         {
           list1.add(res);
           res="";
         }
}
System.out.println(list1);
for(int i=0;i<list1.size()-1;i++)
{
    for(int j=i+1;j<list1.size();j++)
    {
        if(list1.get(i).equals(list1.get(j)))
        {
             list2.add(list1.get(i));
             c++;
        }
    }
}
int c1=list1.size()-2*c;
System.out.println("repeated words an count :"+c+" "+list2);
list1.removeAll(list2);
System.out.println("unique words  and count :"+c1+" "+list1);

	}
}


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
	//Scanner s=new Scanner(System.in);
	String s="abac";
	int c=0;
	ArrayList<String> list=new ArrayList<String>();

	for(int i=0;i<s.length();i++)
	{
	    list.add(String.valueOf(s.charAt(i)));
	}
	for(int j=0;j<s.length()-1;j++)
	{
	    int k=j+1;
	    String add1="";
	    add1=String.valueOf(s.charAt(j))+String.valueOf(s.charAt(k));
	    if(s.charAt(j)!=s.charAt(k))
	          list.add(add1);
	}
	 for(int l=0;l<s.length();l++)
	{
	    int count=0;
	    int a=l;
	    String add2="";
	    while(count<3 && a<s.length()){
	           if(!add2.contains(String.valueOf(s.charAt(a))))
	              add2=add2+s.charAt(a);
	              count++;
	              a++;
	        
	            //  System.out.println("str :"+add2);
	     }
	     if(add2.length()==3)
	             list.add(add2);
	}
	System.out.println(list);

	}
}

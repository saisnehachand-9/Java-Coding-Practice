/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	int c=0,v=0,d=0,sp=0,space=0;
	for(int i=0;i<s1.length();i++)
	{
	    char ch=s1.charAt(i);
	    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  )
	       v++;
	       else if(Character.isLetter(ch))
	            c++;
	            else if(ch>='0' && ch<='9')
	                 d++;
	                 else if(ch==' ')
	                    space++;
	                    else
	                       sp++;
	}
	System.out.print(v+" "+c+" "+d+" "+space+" "+sp);
	}
}


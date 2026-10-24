/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public int cp(String in1,int l)
    {
        String arr[]=in1.split(" ");
        int count=0;
       
        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i];
             String rev="";
            for(int j=str.length()-1;j>=0;j--)
            {
                rev=rev+str.charAt(j);
            }
            if(rev.equals(str))
               count++;
        }
         return count;
            }
	public static void main(String[] args) {
	    Main m=new Main();
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	int len=s.nextInt();
	System.out.println(m.cp(s1,len));
	}
}

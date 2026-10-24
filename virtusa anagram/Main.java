/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public String anagramCheck(String input1,String input2){
        int l1=input1.length();
        int l2=input2.length();
        if(l1==l2)
        {
           char arr1[]=input1.toLowerCase().toCharArray();
           char arr2[]=input2.toLowerCase().toCharArray();
           Arrays.sort(arr1);
           Arrays.sort(arr2);
           if(Arrays.equals(arr1,arr2) )
              return "yes";
              else 
              return "no";
        }
        return "no";
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	Main m=new Main();
	System.out.println(m.anagramCheck(s1,s2));
	}
}




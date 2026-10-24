/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static int reverseNum(int a)
{
    int rev=0;
    while(a>0)
    {
        int x=a%10;
        int y=a/10;
        rev=rev*10+x;
        a=y;
    }
    return rev;
}
public static int countDigits(int b)
{
    int c=0;
    while(b>0)
    {
        int x=b%10;
        int y=b/10;
         c++;
        b=y;
    }
    return c;
}
public static String checkPalindrome(int c)
{
    int rev=0;
    int temp=c;
    while(c>0)
    {
        int x=c%10;
        int y=c/10;
        rev=rev*10+x;
        c=y;
    }
    if(rev==temp)
         return " a Palindrome";
         else
         return "not a Palindrome";
}

	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter Count");
	    int count=s.nextInt();
	    while(count>0){
		System.out.println("Enter a number");
		int n=s.nextInt();
	   	int m=reverseNum(n);
     	int n1=countDigits(n);
	    String o=checkPalindrome(n);
	    System.out.println("Reverse of "+n+" is : "+m);
	    System.out.println(n1+" digits are present in "+n);
	    System.out.println(n+" is : "+o);
	    count--;
	    }
		
		
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static int palindrome(int x)
    {
        String rev="";
        while(x > 0)
        {
            int rem=x % 10;
            rev=rev+String.valueOf(rem);
            x=x/10;
        }
        return Integer.valueOf(rev);
    }
	public static void main(String[] args) {
		int n1=100;
		int c1=0,c2=0;
		int temp1=n1-1;
		int temp2=n1+1;
		while(temp1 > 0)
		{
		    int pal=palindrome(temp1);
		    if(pal==temp1)
		    {
		        c1++;
		        if(c1==1)
		        {
		           System.out.println("before palindrome of"+" "+n1+":"+pal);
		        }
		    }
		    temp1--;
		}
		while(temp2 > 0)
		{
		    int pal=palindrome(temp2);
		    if(pal==temp2)
		    {
		        c2++;
		        if(c2==1)
		        {
		           System.out.print("after palindrome of"+" "+n1+":"+pal);
		        }
		    }
		    temp2++;
		}
	}
}

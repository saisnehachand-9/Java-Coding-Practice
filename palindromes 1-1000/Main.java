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
	int n=1,c=0;
	while(n < 1000)
	{
	    int pal=palindrome(n);
	    if(pal==n)
	    {
	       System.out.print(n+" ");
	       c++;
	    }
	       n++;
	}
	System.out.println();
		System.out.println("count is  :"+" "+c);
	}
}

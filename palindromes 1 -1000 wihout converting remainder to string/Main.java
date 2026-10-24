/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static int pal(int a)
    {
        int rev=0;
        while(a>0)
        {
            int rem=a % 10;
            rev=rev*10+rem;
            a=a/10;
        }
        return rev;
    }
	public static void main(String[] args) {
		int x=1000;
		int y=1;
		while(y <= x)
		{
		    int pal=pal(y);
		    if(pal == y)
		      System.out.print(y+" ");
		      y++;
		}
	}
}

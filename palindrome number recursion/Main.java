/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
   static int rev=0;
    static int pal(int x)
    {
     
        if(x!=0) //121
        {
            int rem=x%10; // 1  2 2
            rev=rev*10+rem; //1 12 
            x=x/10; //12  2
            pal(x);
            }
        return rev;
            
    }
	public static void main(String[] args) {
	    int n=121;
int palind=pal(n);
System.out.print(palind);
if(palind==n)
   System.out.print("palindrome");
   else
   System.out.print("not palindrome");
	}
}

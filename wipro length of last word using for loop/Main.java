/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String s1="sai baba";
		int c=0;
		for(int i=s1.length()-1;i>0;i--)
		{
		    if(s1.charAt(i) !=' ')
		        c++;
		        else 
		         break;
		}
		System.out.print(c);
	}
}

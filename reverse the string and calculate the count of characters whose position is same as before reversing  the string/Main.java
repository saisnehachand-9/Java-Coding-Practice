/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int unaffectedChar(String dataStream)
    {
        int answer=0;
        String rev="";
        
        for(int i=dataStream.length()-1;i>=0;i--)
		{
		    rev=rev+dataStream.charAt(i);
		}
		
		for(int k=0;k<dataStream.length();k++)
		{
		    if(dataStream.charAt(k)==rev.charAt(k))
		       answer++;
		}
		return answer;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.print(unaffectedChar(s1));
	}
}

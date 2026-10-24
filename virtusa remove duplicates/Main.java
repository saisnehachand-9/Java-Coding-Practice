/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public String removeduplicates(String input1)
    {
        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
        String res="";
        for(int i=0;i<input1.length();i++)
        {
            set.add(input1.charAt(i));
        }
        for(Character ch:set)
        {
            res=res+ch;
        }
        return res;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		Main m=new Main();
		System.out.println(m.removeduplicates(s1));
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
    String a="ANAGRAMS";
		String b="NOT ANAGRAMS";
  String anagram(String x,String y)
    {
        String l=x.replaceAll("\\s","");
        String m=y.replaceAll("\\s","");
        if(l.length()==m.length())
        {
            char[] ch1=l.toLowerCase().toCharArray();
            char[] ch2=m.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2))
                return a;
            else
                return b;
         }
         else
             return b;
    }
    
	public static void main(String[] args) {
	
		Main z=new Main();
		System.out.print(z.anagram("cat tac","tac cat"));
	}
}

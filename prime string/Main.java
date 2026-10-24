/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();  //sneha
        int evensum=0,oddsum=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<s1.length();i++)
        {
            if(i % 2==0)
            evensum=evensum+Integer.valueOf(s1.charAt(i));
            else
            oddsum=oddsum+Integer.valueOf(s1.charAt(i));
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        int diff=Math.abs(evensum-oddsum);
        System.out.println(diff);
        for(int i=3;i<10;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
            if(i % j==0)
             c++;
            }
            if(c==2)
               list.add(i);
        }
        System.out.println(list);
        for(int k=0;k<list.size();k++)
        {
            if(diff % list.get(k)== 0)
            {
               System.out.println("prime string");
               break;
            }
               else
                  System.out.println("not a prime string");
        }
    }
}
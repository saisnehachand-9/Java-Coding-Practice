/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main
{
    void GetMax(int a,int b,int c)
    {
        if((a>b) && ( a>c))
           System.out.println(a);
           else if((b>a) && (b>c))
             System.out.println(b);
             else
             System.out.println(c);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int y=s.nextInt();
       int z=s.nextInt();
       Main a=new Main();
        a.GetMax(y,y,z);
    }
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main
{
    public boolean isPrime(int no)
    {
        int c=0;
        for(int i=1;i<=no;i++)
        {
            if(no % i ==0)
              c++;
        }
        if(c==2)
           return true;
           else 
           return false;
    }
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    Main m=new Main();
    System.out.println(m.isPrime(n));
    }
}








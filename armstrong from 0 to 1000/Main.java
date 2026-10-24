/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static int armstrongornot(int no)
    {
        int sum=0;
        while(no > 0)
        {
            int rem=no % 10;
            sum=sum+rem*rem*rem;
            no=no/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int x=1;
        while(x < 1000)
        {
           int arm=armstrongornot(x); 
           if(arm==x)
              System.out.print(x+" ");
              
              x++;
        }
    }
}

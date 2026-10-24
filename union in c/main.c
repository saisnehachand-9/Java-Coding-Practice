/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

union un
{
   
    float b;
     int a;
};
int main()
{
   union un u;
   u.b=17.9;
    u.a=10;
   printf("%f\n",u.b);
   printf("%d\n",u.a);
}

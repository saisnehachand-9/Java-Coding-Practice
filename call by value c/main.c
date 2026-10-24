/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a=10,b=20;
    swap(a,b);
    printf("%d\n",a);
     printf("%d",b);
}
void swap(int x,int y)
{
    int t;
    t=x;
    x=y;
    y=t;
    printf("%d\n",x);
    printf("%d\n",y);
}

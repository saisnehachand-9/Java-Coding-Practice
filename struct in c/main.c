/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>
struct st
{
    int a;
    float b;
}s1;
int main()
{
    s1.a=10;
    s1.b=100.0;
    printf("%d\n",s1.a);
    printf("%f",s1.b);
}
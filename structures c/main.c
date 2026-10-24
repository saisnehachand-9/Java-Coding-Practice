/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>
struct st{
    int age;
    char name[10];
    
}s1;
int main()  
{  
    printf("enter the name");
   scanf("%s",s1.name);
   printf("enter the age");
    scanf("%d",&s1.age);
   printf("name and age %d,%s",s1.age,s1.name);
}  
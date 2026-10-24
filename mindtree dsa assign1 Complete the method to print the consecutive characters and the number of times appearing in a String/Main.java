/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main {
static void printRLE(String s)
{
 String s1=s.toLowerCase();
 for (int i = 0; i < s1.length(); i++) {
 int count = 1;
 while (i + 1 < s1.length() && s1.charAt(i) == s1.charAt(i+ 1)) {
 i++;
count++;
 }
 System.out.print(s1.charAt(i)+ "" + count + " ");
 }
 System.out.println();
}
public static void main(String args[])
{
 printRLE("aAbcccccaaA");
 printRLE("BBBBbbb");
}
}
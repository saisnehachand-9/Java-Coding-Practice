/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	String s1="abcdef";
     int m=2;
     int n=2;
     String newstr="";
     String rev="";
     String newrev="";
     int endlen=s1.length()-1; //5
         int c=0;
         for(int i=0;i<m;i++)
         {
             rev=rev+s1.charAt(endlen); //f
                endlen--;
                c++;  //1
         }
         for(int i=rev.length()-1;i>0;i--)
         {
             rev=rev+rev.charAt(i);
         }
         for(int j=0;j<s1.length()-m;j++ )
         {
             rev=rev+s1.charAt(j);
         }
         System.out.println("rev "+rev);
         endlen=s1.length()-1;
         System.out.println(endlen);
         for(int a=0;a<n;a++)
         {
             int x=s1.length()-n; // 4
             newrev=newrev+rev.charAt(x+1); //f
                endlen--;
                  
         }
         for(int b=0;b<rev.length()-n;b++ )
         {
             newrev=newrev+rev.charAt(b);
         }
         System.out.println(newrev);
	}
}


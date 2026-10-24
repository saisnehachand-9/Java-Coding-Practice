/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String arr[]=new String[n];
    for(int a=0;a<n;a++)
    {
        arr[a]=s.next();
    }
    s.nextLine();
    String s1=s.nextLine();
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<n;i++)
    {
        String str=arr[i];
        int cap=0, digit=0,b=0,c=1,match=0;
       for(int j=0;j<str.length();j++)
        {
            if(Character.isUpperCase(str.charAt(j)))
                  cap++;
              if(Character.isDigit(str.charAt(j)))
                         digit=digit+Character.getNumericValue(str.charAt(j));
                  
        }
       if(cap==Character.getNumericValue(s1.charAt(0)))
        {
           int l=str.length()-1;
           while(b<3)
           {
              
               if(str.charAt(l)==s1.charAt(c))
                  match++;
                  l--;
                  c++;
                  b++;
           }
            
             if(match==3)
             {
               if(digit==Character.getNumericValue(s1.charAt(s1.length()-1)))
                         System.out.println("matched password:  "+str);
           }
             
        }
      
    }
  
    }
}
